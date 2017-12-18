package com.algorithms.abhilash;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DPCoinChange {
    
    public static class Key{
        int money;
        int index;
        public Key(int money,int index){
            this.money=money;
            this.index=index;
        }
        
        public int hashCode(){
            return money+index;
        }
        public boolean equals(Object key){
            Key target=(Key)key;
            boolean bool=this.money==target.money && this.index==target.index;
            return bool;
        }
            
    }
    
    public static long makeChange(int[] coins,int money,int index,HashMap<Key,Long> memo){
        if(money==0)
            return 1;
        if(index>=coins.length)
            return 0;
        int amountWithCoin=0;
        long ways=0L;
        Key key=new Key(money,index);
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        while(amountWithCoin<=money){
            int remaining=money-amountWithCoin;
            ways+=makeChange(coins,remaining,index+1,memo);
            amountWithCoin+=coins[index];
        }
        memo.put(key,ways);
        return ways;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        HashMap<Key,Long> memo=new HashMap<Key,Long>();
        System.out.println(makeChange(coins,n,0,memo));
        in.close();
    }
}


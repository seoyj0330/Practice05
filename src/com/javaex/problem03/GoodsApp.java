package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       ArrayList<Goods> goodList = new ArrayList<Goods>();
       int sum = 0; //갯수 합계
       
       System.out.println("상품 3개를 입력해주세요");
       
       for(int i = 0; i < 3; i++) {
        
        String input = scan.nextLine();
        String[] goodsInfo =input.split(" ");
        
        Goods goods = new Goods();
        goods.setName(goodsInfo[0]);
        goods.setPrice(Integer.parseInt(goodsInfo[1])); //문자열 숫자로 반환
        goods.setCount(Integer.parseInt(goodsInfo[2]));
        
        goodList.add(goods); //리스트에 추가
        
        //sum = sum + goods.getCount();
     
       }
       
       for(Goods gd : goodList) {
        gd.gInfo();
        sum = sum + gd.getCount();
       }
       
       System.out.println("모든 상품의 갯수는 " + sum + "개 입니다.");
       
     
     scan.close();
    }

}


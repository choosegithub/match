package com.contest;

public class CommonGoods extends Item {
	public void updateQuality(){
		   System.out.print("普通商品当天的数据");
		   
		   super.sellIn = super.sellIn -1;
		   if(super.sellIn>=0){
			   super.quality = super.quality-1;
		   }else{
			   super.quality = super.quality-2;
		   }
		   if(super.quality<0){
			   super.quality = 0;
		   }
	}
	
	public CommonGoods(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
}

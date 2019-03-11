package com.contest;

/**
 * 传奇商品"Sulfuras"（游戏中的魔法锤道具）永不到期，也不会降低品质`Quality`
 * @author Eclipse
 *
 */
public class Sulfuras extends Item {

	public void updateQuality(){
		   System.out.print("传奇商品当天的数据");
		   if(super.sellIn>0){
			   super.sellIn = super.sellIn-1;
		   }
		   super.quality = 80;
	}
	
	public Sulfuras(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
    }
}

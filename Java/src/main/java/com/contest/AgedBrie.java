package com.contest;

/**
 * 法国干酪的品质`Quality`会每天增1
 * @author Eclipse
 *
 */
public class AgedBrie extends Item {
	
	public void updateQuality(){
		   System.out.print("法国干酪当天的数据");
		   super.sellIn = super.sellIn-1;
		   if(super.quality<50){
			   super.quality = super.quality +1;			   
		   }
	}
	
	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
    }
}

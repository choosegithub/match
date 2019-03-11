package com.contest;

/**
 * 剧场后台通行证,其品质`Quality`在剧场开演前10天以外，每天增1；
 * 当离开演不足不足10天（含10天）时，品质`Quality`每天增2；
 * 当离开演不足5天（含5天）时，品质`Quality`每天增3；
 * 但一旦演出结束，品质就会降为0 
 * @author Eclipse
 *
 */
public class BackstagePasses extends Item {
	
	public void updateQuality(){
		   System.out.print("剧场后台通行证当天的数据");
		   super.sellIn = super.sellIn-1;
		   if(super.sellIn>10){
			   super.quality = super.quality +1;
		   }else if(super.sellIn<=10 && super.sellIn >5){
			   super.quality = super.quality +2;
		   }else if(super.sellIn<=5 && super.sellIn>0){
			   super.quality = super.quality +3;
		   }else {
			   super.quality = 0;
		   }
		   if(super.quality>=50){
			   super.quality = 50;
		   }
	}
	
	public BackstagePasses(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
    }
}

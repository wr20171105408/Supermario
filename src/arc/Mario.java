package arc;
import java.awt.Color;

import com.rupeng.game.GameCore;
public class Mario implements Runnable{
	public static void main(String[] args) {
		GameCore.start(new Mario());
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//超级玛丽游戏主页面
		GameCore.setGameTitle("小王游戏");
		GameCore.setGameSize(554, 326);
		GameCore.loadBgView("mariosplash.jpg");
		int x = 200,y = 30;
		int titlenum = 0;
		int onenum = 1;
		int twonum = 2;
		int othernum = 3;
		GameCore.createText(titlenum, "超级玛丽");
		GameCore.setTextFontSize(titlenum, 40);
		GameCore.setTextPosition(titlenum, x, y);
		GameCore.setTextColor(titlenum, Color.orange);
		GameCore.createText(onenum, "1、单人游戏");
		GameCore.createText(twonum, "2、双人游戏");
		GameCore.createText(othernum, "3、关于");
		GameCore.setTextFontSize(onenum, 20);
		GameCore.setTextFontSize(twonum, 20);
		GameCore.setTextFontSize(othernum, 20);
		y = y + 60;
		GameCore.setTextPosition(onenum, x, y);
		y = y + 40;
		GameCore.setTextPosition(twonum,x, y );
		y = y + 40 ;
		GameCore.setTextPosition(othernum, x, y );
		GameCore.playSound("超级玛丽民乐版.mp3", true);
		//精灵
		int marionum = 0;
		int mariox = 50;
		GameCore.createSprite(marionum, "mario");
		GameCore.setSpriteFlipX(marionum, true);
		GameCore.playSpriteAnimate(marionum, "walk", true);
		while(mariox<500) {
			mariox=mariox+50;
			GameCore.setSpritePosition(marionum, mariox, 200);
			if(mariox>=500)
				mariox = 50;
			GameCore.pause(150);
		}
		//GameCore.pause(100000);
	}

}

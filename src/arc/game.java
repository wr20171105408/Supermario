package arc;
import com.rupeng.game.GameCore;
public class game implements Runnable{
	public static void main(String[] args) {
		System.out.println("aaa");
		GameCore.start(new game());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*GameCore.setGameTitle("老GAY游戏");
		GameCore.loadBgView("14.jpg");
		GameCore.alert("第一关");
		GameCore.playSound("超级玛丽民乐版.mp3", true);//ture是一直播放
		GameCore.pause(3000);
		//GameCore.closeSound("超级玛丽民乐版.mp3 ");
		GameCore.alert("第二关");
		GameCore.closeSound("超级玛丽民乐版.mp3");
		GameCore.playSound("HOT.mp3", false);//false是播放一次
		GameCore.pause(3000);	
		String username = GameCore.input("王锐", "请输入您的姓名");
		GameCore.setGameTitle(username);
		boolean b = GameCore.confirm("是否继续游戏？");
		GameCore.alert(b);
		GameCore.alert("游戏结束");
		String a = GameCore.input("第一个数", "输入");
		String b = GameCore.input("第二个数","输入");
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int num = a1 + b1;
		GameCore.alert("结果是：" + num);
		GameCore.setGameTitle("哈哈哈哈");
		GameCore.alert("输入您的名字");
		String name = GameCore.input("", "请输入您的名字");
		GameCore.setGameTitle(name);
		GameCore.alert("请您设置窗口的大小");
		String w = GameCore.input("", "宽度");
		String h = GameCore.input("", "高度");
		GameCore.setGameSize(Integer.parseInt(w), Integer.parseInt(h));
		GameCore.playSound("超级玛丽民乐版.mp3", true);//ture是一直播放
		GameCore.pause(3000);*/
	}

}

package java0420;

import lombok.Getter;
import lombok.Setter;
abstract class PlayerLevel{
	public abstract void turn();
	public abstract void jump();
	public abstract void run();
	public abstract void showLevel();
	
	public final void play(int count) {
		run();
		for(int i =0; i<count; i++){
			jump();
		}
		turn();
	}
}
		class BeginnerLevel extends PlayerLevel{

			@Override
			public void turn() {
				// TODO Auto-generated method stub
				System.out.println("아직 턴 못함");
			}

			@Override
			public void jump() {
				// TODO Auto-generated method stub
				System.out.println("아직 점프 못함");
			}

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("느리게 걷는다");
			}

			@Override
			public void showLevel() {
				// TODO Auto-generated method stub
				System.out.println("초급자레벨입니다*****");
			}
		}
class AdvancedLevel extends PlayerLevel{

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("아직 턴 못함");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("높게 점프");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("빠르게 걷는다");
	}
	@Override
	public void showLevel() {
		// TODO Auto-generated method stub
		System.out.println("중급자레벨입니다*****");
	}
}
class SuperLevel extends PlayerLevel{
	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("턴 한바퀴");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("아주 높게 점프");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("아주 빠르게 걷는다");
	}
	@Override
	public void showLevel() {
		// TODO Auto-generated method stub
		System.out.println("고급자레벨입니다*****");
	}
}
@Getter @Setter
public class Player {
	private PlayerLevel level;
	public Player(){	//생성자 깜빡함
		level = new BeginnerLevel();
		level.showLevel();
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level; //레벨멤버변수 값 변경 안함
		level.showLevel();
	}
	public void play(int count) {
		level.play(count);
	}

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		aLevel.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		sLevel.play(3);
		
				
	
	
	}//main
}

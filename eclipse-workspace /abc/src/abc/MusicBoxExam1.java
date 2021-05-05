package abc;

public class MusicBoxExam1 {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		MusicBox box = new MusicBox();
		
		MusicPlayer kang = new MusicPlayer(1, box);
		MusicPlayer kim = new MusicPlayer(2, box);
		MusicPlayer lee = new MusicPlayer(3, box);
		
		kang.start();
		kim.start();
		lee.start();
	}

}

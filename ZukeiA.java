class ZukeiA extends Zukei{
		// オーバーライドして中身の処理を記述
		public void Circle(int r){
			int kekka=(int)(r*r*3.14);
			System.out.println(kekka + "です");
		}
		public void Rectangle(int yoko,int tate){
			int kekka=yoko*tate;
			System.out.println(kekka+"です");
		}
}
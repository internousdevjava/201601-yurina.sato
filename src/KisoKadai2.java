/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai2 {

	public static void main(String[] args) {


		System.out.println("1～100の数字を入れてください★5回挑戦できます。0以下、100以上の数字を入力した場合もカウントされます");




			int r =new java.util.Random().nextInt(100);







			for (int x=1;x<=5;x++){


				int number = new java.util.Scanner(System.in).nextInt();



				boolean b = number>100;
				if(b==true){
					System.out.println("1～100までの数字を入力してください");
				}
				else if(number==0){
					System.out.println("0より大きい数を入力してください。");
				}
				else if(r+1>number && x!=5 && number!=0){
					System.out.println("もっと大きい数を入力してください");
				}
				else if(r+1<number && x!=5 && b==false){
					System.out.println("もっと小さい数を入力してください");
				}
				else if (r+1==number){
					System.out.println("あたりです");
				}
				else if (x==5 && number!=r+1){
					System.out.println("残念でした★また挑戦してくださいね");
				}




			}


	}

}

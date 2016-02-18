import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class NumberGame {
	public static void main(String[] args) throws IOException{
		// 画面クリア
		System.out.print("\n\n\n");
		System.out.println("=============================================================================");
		System.out.println("= .  .  .           .     .     .  .............                            =");
		System.out.println("=  . . .  .          .    .    .              .                             =");
		System.out.println("= ........ .......  .............            .                              =");
		System.out.println("=  . ...  .    .                .           .      ....   ..   .   . .....  =");
		System.out.println("= .  .. .  .   .                .          .      .   .  .  .  .. .. .      =");
		System.out.println("= ........ ..  .    .............          .     .       ....  . . . .....  =");
		System.out.println("=   .  .    .  .                .          .     .   .. .    . .   . .      =");
		System.out.println("=    ..      .                  .           .     ....  .    . .   . .....  =");
		System.out.println("=   .  .   .. ...   .............            .                              =");
		System.out.println("=                                                                           =");
		System.out.println("=============================================================================");
		System.out.println("                                                                             ");
		System.out.println(" Ver.1.0.0                                                                   ");
		System.out.println(" Copyright(c) 2014 Takuma Inoue All Right Reserved.                          ");
		System.out.println("                                                                             ");


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rnd = new Random();//Randomクラスのインスタンス化

		String str = null;
		int c = 0, l = 0,m=0;
		int end = 0;
		int ran = 0;

		System.out.println("[ ゲーム説明 ]\nＣＰＵが1～100の数字をランダムで作成します。\nそれを当ててください。");
		System.out.println("\n1:ゲーム開始 2:終了\n");

		while(end==0){
			str = br.readLine();
			switch (str){
			case "1":
				end=1;
				break;
			case "2":
				end=1;
				System.out.println("終了しました。");
				System.exit(0);
			default :
				System.out.println("1～2の範囲で選択してください。");
				break;
			}
		}

		while(m==0){
		end = 0;
		ran = rnd.nextInt() % 101;//乱数作成
		if(ran<0){//もし乱数がマイナスだったら-1をかけてプラスに
			ran*= -1;
		}
		System.out.println("1～100の数字を入力してください、終了するときは1000を入力してください。\n");
		c=0;
		while(end==0){
				try{
					str = br.readLine();
					int nu= Integer.parseInt(str);
					if(nu==1000){
						end=1;
						System.out.println("終了しました。");
						System.exit(0);
					}
					if(nu==ran){
						c++;
						System.out.println("正解です！おめでとう！！！");
						System.out.println("　　　　_＿_　%");
						System.out.println("　 γ´　　　｀ヽ");
						System.out.println("　 i.　●　 ●　i");
						System.out.println("''∩. ¨ ∇ ¨ .|   "+ c + "回目で正解だったなっしー");
						System.out.println("　ヽ ────‐ν");
						System.out.println("　│廿　∞  　 .|");
						System.out.println("　├――――――.|");
						System.out.println("　 ヽ＿:´｀:.＿丿");

						System.out.println("\n\n\nゲームを続けますか？(y/n)");
						while(l==0){
							str = br.readLine();
							switch (str){
							case "y":
								end=0;
								l=1;
								break;
							case "n":
								end=1;
								System.out.println("終了しました。");
								System.exit(0);
							case "Y":
								end=0;
								l=1;
								break;
							case "N":
								end=1;
								System.out.println("終了しました。");
								System.exit(0);
							default :
								System.out.println("y/nで入力してください。");
								break;
							}
						}

						l=0;
						end = 1;

					}else{
						if(nu>ran){
							c++;
							System.out.println("もっと小さいです。");
						}else{
							c++;
							System.out.println("もっと大きいです。");
						}
					}
				}catch(Exception e){
					System.out.println("入力エラーです");
				}
			}
		}
		System.out.println("終了しました");
	}
}


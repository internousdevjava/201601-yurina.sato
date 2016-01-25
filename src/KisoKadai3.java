import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;








public class KisoKadai3{

	public static void main(String[] args) throws IOException{


			System.out.println();



			int x=1;





			while(x!=4){
				System.out.println("このプログラムは/1新規/2書き込む/3読む/4終了/をすることができます。");
				x= new java.util.Scanner (System.in).nextInt();


				if(x==1){
					System.out.println("ファイルを作成します。ファイル名を入力してください(例)C:\\Users\\internous\\Desktop\\新JavaScript演習\\abc.txt");
					methodA();
				}



				if(x==2){
					System.out.println("ファイルに書き込みます。ファイルがなければ新規作成します。編集したいファイル名を入力してください。C:\\Users\\internous\\Desktop\\新JavaScript演習\\abc.txt");
						methodB();
				}







				if(x==3){
					System.out.println("ファイルを開きます。ファイル名を入力してください");
						methodC();
				}
			}


			System.out.println("終了します");

	}









			//ファイルを作るメソッド
			public static String methodA(){

				String name=new java.util.Scanner (System.in).nextLine();

//     name=C:\\Users\\internous\\Desktop\\新JavaScript演習\\abc.txtを入力する

				 File b = new File(name);




				boolean a=!b.exists ();{
					if(a==true){
						System.out.println(name+"を作成しました。");
						}
					else {
						if(a==false){
							System.out.println("そのファイル名は存在しています。");

						}

					}



				}

					try{
						if(b.createNewFile()){
							System.out.println("確認してください");
						}
							else{
								System.out.println("ファイル作成に失敗しました。最初からやり直してください");
							}
					}
						catch(IOException e){
							System.out.println(e);
						}

					return name;

				}
















           //ファイルを書くメソッド
			public static void methodB(){


				String name=new java.util.Scanner(System.in).nextLine();
					System.out.println("書き込んでください");

						try{
							File b=new File(name);

							String pw=new java.util.Scanner(System.in).nextLine();

							boolean a=b.exists ();

								if(a==true){
									PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter(name)));

									p.println(pw);


									p.close();

								    System.out.println("書き込みました");

								}else{

									System.out.println("ファイルに書き込めません");
								}
						}catch(IOException e){
				    	  System.out.println(e);
						}


			}



			//ファイルを開くメソッド
			public static void methodC(){

				String name=new java.util.Scanner (System.in).nextLine();
				System.out.println("ファイルを開きました。内容を入力してください");

			//

				 File b = new File(name);


					boolean a=b.exists ();{
						if(a==true){
							System.out.println("読み込みました");


							}
						else {
							if(a==false){
								System.out.println("そのファイル名は存在しています。新規作成します");
								name=methodA();

							}

						}



								try{
									File file = new File(name);
										FileReader fr =new FileReader(file);


										 int ch = fr.read();

										 	while(ch != -1){
										 		System.out.print((char)ch);

										 		ch = fr.read();
										 	}


								} catch(IOException e){
									System.out.println(e);
								}







					}

			}














	}






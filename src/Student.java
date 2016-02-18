
public class Student {

	//フィールド
	String name;
	int kokugo;
	int sansu;


	//コンストラクタの定義
	Student(String n,int k,int s){
		this.name=n;
		this.kokugo=k;
		this.sansu=s;
	}


	//nameに引数n、kokugoに「0」、sansuに「0」を格納
			Student(String n){
				this(n,0,0);

			}

	//nameに引数n、
			Student(String n,int s){
				this(n,0,s);
			}









	public void setName(String n){
		name=n;
	}

	public void setKokugo(int k){
		kokugo=k;
	}

	public void setSansu(int s){
		sansu=s;
	}

	public String getname(){
	return name;
}
public int getkokugo(){
	return kokugo;
}
public int getsansu(){
	return sansu;
}

	//各フィールドの値を表示
	void show(){
	System.out.println("氏名："+name);
	System.out.println("国語："+kokugo);
	System.out.println("算数："+sansu);
	}
}

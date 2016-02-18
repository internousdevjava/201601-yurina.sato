

public class Employee {

	//フィールド
	static int number=0;	//総従業員数
	int code;		//従業員番号
	String name;	//社員名
	int year;		//入社年数
	int age;		//年齢


	//コンストラクタの定義
	
	
	Employee(String name,int year,int age){
		this.name=name;
		this.year=year;
		this.age=age;
		code=++number;	//numberを1つカウントアップする
	}

		//nameに「未定」、yearに「0」、ageに「0」を格納
		Employee(){
			this("未定",0,0);
		}

		//nameに引数name、yearに「0」、ageに「0」を格納
		Employee(String name){
			this(name,0,0);
		}


		//nameに引数name、yearに「0」、ageに変数ageを格納
		Employee(String name,int age){
			this(name,0,age);
		}


		//従業員名を設定するメソッド
		public void setName(String name){
			this.name=name;
		}


		//入社年数を設定するメソッド
		public void setYear(int year){
			if(year>0){
				this.year=year;
			}
		}

		//年齢を設定するメソッド
		public void setAge(int age){
			if(age>0){
				this.age=age;
			}
		}

		//従業員名を取得するメソッド
		public String getName(){
			return name;
		}

		//入社年数を取得するメソッド
		public int getYear(){
			return year;
		}

		//年齢を取得するメソッド
		public int getAge(){
			return age;
		}

	//各フィールドの値を表示するメソッド
	void display(){
		System.out.println("従業員番号："+code);
		System.out.println("従業員名："+name);
		System.out.println("入社年数："+year);
		System.out.println("年　　齢："+age);
	}
}

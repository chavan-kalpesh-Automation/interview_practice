package samplepracticepkg;

import java.util.ArrayList;

public class DecalreArryList {
	public static void main(String[] args) {
ArrayList<String>names=new ArrayList<String>();
names.add(0,"kalpesh");
names.add(1,"mahendra");
names.add(2,"kiran");

names.remove(2);
names.add(2,"amol");

System.out.println(names);

	}
}

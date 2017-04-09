package day01;

import java.util.Arrays;

/**
 * Created by caoyuncong on
 * 2017/4/9 20:56
 * promotion.
 */
public class Name implements Comparable<Name>{
    public String firstName,lastName;
    public Name(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public int compareTo(Name o) {          //实现接口
        int lastCmp=lastName.compareTo(o.lastName);
        return (lastCmp!=0?lastCmp:firstName.compareTo(o.firstName));
    }
    public String toString(){                //便于输出测试
        return firstName+" "+lastName;
    }

    public static void main(String[] args) {
        Name nameArray[] = {
                new Name("John", "Lennon"),
                new Name("Karl", "Marx"),
                new Name("Groucho", "Marx"),
                new Name("Oscar", "Grouch")
        };
        Arrays.sort(nameArray);
        for(int i=0;i<nameArray.length;i++){
            System.out.println(nameArray[i].toString());
        }
    }
}


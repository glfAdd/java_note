/*
基本数据类型
byte        1字节         -128~127
short       2            -2^15~2^15-1
int         3
long        4           (后面必须加上l或L)
float       4           (结尾加f或F)
double      8           (结尾d或D加不加都行)
char        2

逻辑运算
&       与
&&      短路与(如果执行一个就能知道结果就不再执行另一个)
|       或
||      短路或(如果执行一个就能知道结果就不再执行另一个)
!       非
^       异或(两边相同为false, 不同为true)

*/

public class LearnDataType {
    public static void main(String[] args) {
        System.out.println("***************** 字符");
        char a = 'a';
        char b = 42;
        char c = '哈';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        System.out.println("***************** 自动类型提升");
//        自动类型提升: 小容量和大容量做运算
//        byte, short, char -> int -> long -> float -> double
        byte d = 100;
        int e = d + 2;
        System.out.println(e);

        int f = 10;
        int g = f / 3;
        System.out.println(g);

        int h = 100;
        double i = (10 + 0.0) / 3;
        System.out.println(i);

        double k = (double) 10 / 3;
        System.out.println(k);


        System.out.println("***************** 强制类型转换");
//        强制类型转换: 自动类型提升的逆过程, 精度可能会与损失
        int l = (int) k;
        System.out.println(l);


        System.out.println("***************** 算数运算符");
        int m = 40;
        int n = m++;
        System.out.println(m);
        System.out.println(n);

        int o = 200;
        int p = ++o;
        System.out.println(o);
        System.out.println(p);

        System.out.println("***************** boolean");
        boolean q = false;
        System.out.println(q);

        System.out.println("***************** 逻辑运算");
        int r = 30;
        int s = 40;
        if (r++==31 && s++==41){
            System.out.println(1);
        }
        System.out.println(r);
        System.out.println(s);


    }
}








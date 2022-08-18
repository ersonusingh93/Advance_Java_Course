public class Stringd {
    public static void main(String[] args) {
        String str="hello";
        String str1="world";
        System.out.println(str+ " "+str1);
        System.out.println(str.concat( str1));
        char[] chars=str.toCharArray();
        System.out.println(chars);
        for(int i=0;i<chars.length;i++)
        {
            System.out.println(chars[i]);
        }
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(0));
        System.out.println(str.compareTo(str1));
        System.out.println(str.contains(str));
        System.out.println(str.indexOf('h'));
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
        System.out.println( str.replace('h','w'));
        System.out.println(str.substring(1,5));
       
    }
    
}

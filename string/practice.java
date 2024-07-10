public class practice {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
}
}
class question{
    public String ques;
    public String ans;
    public static int quescount =0;
    
    question(String ques ,String ans){
        this.ques=ques;
        this.ans = ans;
        quescount++;
    }
    public void displayques(){
        System.out.println(ques);
    }
    public boolean checkans(String response){
        return response.equalsIgnoreCase(ans);
    }
    public static int  getcount(){
        return quescount;
    }
}
class multiplechoice extends question{
    String [] option;
   public multiplechoice(String ques,String ans, String[] option ){
        super(ques,ans);
        this.option=option;
    }
    
    public void displayques(){
        super.displayques();
        for(int i=0;i<option.length;i++){
            System.out.println((i+1) + " "+ option[i]);
        }
    }
}
class quizMenu{
    public static void main(String args[]){
        question q1 = new question("pakistan ka baap kon ?", "india");
        q1.displayques();
        String userans = "india";
        System.out.println("your ans :"+ userans);
        System.out.println("correct ans ?"+ q1.checkans(userans));
        String [] opforques2 = {"india","paris","berlin"};
        multiplechoice m1 = new multiplechoice ("pakistan ka baap kon ??","india",opforques2);
        String Muserans="india";
        m1.displayques();
        System.out.println("your ans :"+ Muserans);
    System.out.println("correct ans ?"+ m1.checkans(Muserans));
    }
}
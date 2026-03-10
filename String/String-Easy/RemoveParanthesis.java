public class RemoveParanthesis {
    public String removeOutermostParanthesis(String s){
        int counter=0;
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                counter--;
            }

            if(counter!=0){
                ans.append(s.charAt(i));
            }

            if(s.charAt(i)=='('){
                counter++;
            }
        }
return ans.toString();
    }

    public static void main(String[] args){
        String s="(()())(())";

        RemoveParanthesis removeParanthesis=new RemoveParanthesis();
        System.out.println(removeParanthesis.removeOutermostParanthesis(s));
    }
}

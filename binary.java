class binary{
    public static void main(String[]args){

        int a = 8;
        String res = " ";
        while(a>0){
            int rem = a%2;
            res = rem+res;
            a = a/2;

        }
        System.out.println(res);
    }

}


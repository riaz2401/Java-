class Loop{
    public static void main(String[] args){
        int j = 0;
        for(int i=0; i<=20; i++){
            if(i<=10){
                   System.out.println(j+++" ");
            }else{
                System.out.println(--j+" ");
            }
        }
    }
}

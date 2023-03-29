class Main {
  public static void main(String[] args) {

    
    for(int i=0; i<5; i++)
      {
        for(int a=0; a<i+1; a++)
          {
            System.out.print("*");
            
          }
        System.out.println();
      }
System.out.println();
    for(int i=0; i<6; i++)
      {
        for(int a=5-i; a>0; a--)
          {
            System.out.print(" ");
            
          }
        for(int a=0; a<i; a++)
          {
            System.out.print("*");
            
          }
        System.out.println();
      }
    
  }
}
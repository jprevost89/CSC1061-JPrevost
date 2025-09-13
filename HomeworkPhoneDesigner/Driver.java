class Driver { // start class Driver

   public static void main(String[] args) { // start
   
      FlipModel flip4 = new FlipModel("efsdf34gdfgf3");
      FoldModel fold4 = new FoldModel("as56f365g4gf3");
      BarModel bar4 = new BarModel("efsdfdddsww23");
      
      //- Validate Comparison Interface -//
      System.out.println(flip4.compare(fold4));
      System.out.println(fold4.compare(bar4));
      System.out.println(bar4.compare(flip4));
      
      //--- Validate Repair Interface ---//
      // FlipModel
      System.out.println(flip4.howToRepair());
      System.out.println(flip4.costToRepair());
      
      // BarModel
      System.out.println(bar4.howToRepair());
      System.out.println(bar4.costToRepair());
      
      //------- Validate getImei --------//
      System.out.println("Original IMEI");
      System.out.println(bar4.getImei());
      System.out.println(fold4.getImei());
      System.out.println(flip4.getImei());
      
      //------- Validate setImei -------//
      bar4.setImei("123abc456def7");
      fold4.setImei("789ghi1011jk7");
      flip4.setImei("1213lmn1415o7");
      System.out.println("Updated IMEI");
      System.out.println(bar4.getImei());
      System.out.println(fold4.getImei());
      System.out.println(flip4.getImei());
      
      //----- Validate phone clone -----//
      FlipModel flip2;
      
      try {
         flip2 = (FlipModel) flip4.clone();
         flip2.setImei("clonedphone01");
      } catch (CloneNotSupportedException e) {
         throw new AssertionError();
      }
      
      System.out.println(flip2.howToRepair());
      System.out.println(flip2.costToRepair());
      System.out.println(flip2.compare(bar4));
      
      // Validate Original IMEI was not overwritten
      System.out.println(flip2.getImei());
      System.out.println(flip4.getImei());
      
   } // end

} // end class Driver
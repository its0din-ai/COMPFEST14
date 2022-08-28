class Secret {
   private int cnt = 1;
   private int[] box;
   private int[] mydata = new int[]{0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0};
   private static Secret instance = new Secret();

   private Secret() {
      int var1 = this.mydata.length / 9;
      this.box = new int[var1];
   }

   public static Secret getInstance() {
      return instance;
   }

   public void resetInstance() {
      instance = new Secret();
   }

   public void process(char var1) {
      if (this.cnt <= 9) {
         int var2 = this.mydata.length / 9;

         for(int var3 = 1; var3 <= var2; ++var3) {
            int var4 = 9 * var3 - this.cnt;
            int var5 = this.box[var3 - 1] + this.mydata[var4];
            var5 += var1 - 48;
            this.mydata[var4] = var5 % 2;
            if (var5 >= 2) {
               this.box[var3 - 1] = 1;
            } else {
               this.box[var3 - 1] = 0;
            }
         }

         ++this.cnt;
      }
   }

   private String misteri(int var1) {
      String var2 = "";
      int var3 = 0;

      for(int var4 = 1; var1 > 0; ++var4) {
         var3 |= (var1 & 1) << var4 % 8 - 1;
         var1 >>= 1;
         if (var4 % 8 == 0) {
            if (32 <= var3 && var3 < 128) {
               var2 = (char)var3 + var2;
            }

            var3 = 0;
         }
      }

      var2 = (char)var3 + var2;
      return var2;
   }

   public String getData() {
      int var1 = this.mydata.length / 9;
      String var2 = "";
      int var3 = 5;
      int var4 = 0;

      for(int var5 = 1; var5 <= var1; ++var5) {
         int var6 = 0;
         int var7 = 1;

         for(int var8 = 1; var8 <= 8; ++var8) {
            var6 += this.mydata[9 * var5 - var8] * var7;
            var7 <<= 1;
         }

         --var3;
         var4 = (int)((double)var4 + (double)(var6 - 33) * Math.pow(85.0D, (double)var3));
         if (var3 == 0) {
            var2 = var2 + this.misteri(var4);
            var4 = 0;
            var3 = 5;
         }
      }

      while(var3 > 0) {
         double var10000 = (double)var4;
         --var3;
         var4 = (int)(var10000 + 84.0D * Math.pow(85.0D, (double)var3));
      }

      return var2 + this.misteri(var4);
   }
}

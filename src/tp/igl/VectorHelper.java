

package tp.igl;


public class VectorHelper  {
   
    private int[] tab ;
    private int min;
    private int max;

    public VectorHelper()
    {
        
    }

    public VectorHelper(int [] t)
    {
        tab = t;
        max_min();
           
    }
 
    public int getMin() {
        return min;
    }

   
    public int getMax() {
        return max;
    }
    
    
    public void max_min()
     {
         min = tab[0] ;
         max = tab[0];
         for (int i=0;i<tab.length;i++) {
             if (tab[i]<min)  min = tab[i];
             if (tab[i]>max)  max = tab[i];
         }
     }
    
     public void sommer (int [] tab2) throws VectorHelperException
     {
         if (tab2.length != tab.length ) throw new VectorHelperException ("Veuillez vérifier que les deux tableaux ont la meme longueur ");
         else 
         {
             for (int i=0;i<tab.length;i++) { tab[i] += tab2[i]; }
         }
     }
      
    public void formule () // rajoute 1 à tous les éléments 
    {
        for (int i=0;i<tab.length;i++)
        {
            tab[i]++;
        }
    }
    
     public void inverser()
     {
         int i =0,j=tab.length-1,k=0;
         while (i<j)
         {
             k= tab[i];
             tab[i]=tab[j];
             tab[j]=k;
             i++;j--;
         }
     }
     
    public void trier() // tri par bulles
    {
        int i,j,k;
        for (i=0;i<tab.length;i++)
        {
            for (j=tab.length-1;j>i;j--){
                if (tab[j]<tab[j-1])
                {
                    k=tab[j];
                    tab[j]=tab[j-1];
                    tab[j-1]=k;
                }  
            }
        }  
    }

    
    
}   
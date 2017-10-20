

package tp.igl;

/**
 * une classe qui fournit des operations elementaires sur les vecteurs
 * @author Touati_Zeroual
 */
public class VectorHelper  {
   
    protected int[] tab ;
    private int min;
    private int max;

    /**
     * constructeur vide
     */
    public VectorHelper()
    {
        
    }

    /**
     * Constructeur qui initialise les attributs 
     * @param t c'est un tableau avec lequel on initialise l'attribut tab
     */
    public VectorHelper(int [] t)
    {
        tab = t;
        max_min();
           
    }
 
    /**
     * getter qui retourne l'attribut  min
     * @return le plus petit element du vecteur tab  (entier) 
     */
    public int getMin() {
        return min;
    }

    /**
     *getter qui retourne l'attribut max
     * @return le plus grand element du vecteur tab (entier)
     */
    public int getMax() {
        return max;
    }
    
    /**
     * la methode qui calcule au meme temps le minimum et le maximum du vecteur tab et initialise les attributs min et max 
     */
    public void max_min()
     {
         min = tab[0] ;
         max = tab[0];
         for (int i=0;i<tab.length;i++) {
             if (tab[i]<min)  min = tab[i];
             if (tab[i]>max)  max = tab[i];
         }
     }
    
    /**
     * une methode qui fait la somme entre deux vecteurs
     * @param tab2 le vecteur qu'on ajoute à l'attribut tab (on somme les deux vecteur et le resltat sera dans tab) 
     * @throws VectorHelperException exception lancé si les deux vecterus sont de tailles differentes
     */
    public void sommer (int [] tab2) throws VectorHelperException
     {
         if (tab2.length != tab.length ) throw new VectorHelperException ("Veuillez vérifier que les deux tableaux ont la meme longueur ");
         else 
         {
             for (int i=0;i<tab.length;i++) { tab[i] += tab2[i]; }
         }
     }
      
    /**
     * une methode qui incremente tout les elements du vecteur tab
     */
    public void formule () // rajoute 1 à tous les éléments 
    {
        for (int i=0;i<tab.length;i++)
        {
            tab[i]++;
        }
    }
    
    /**
     * methode qui inverse les elements du vecteur tab
     */
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
     
    /**
     * une methode qui trie les elements du vecteur tab
     */
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
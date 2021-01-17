public class Fraction {
  private long numerator;
  private long denominator;

  //contructeur

  public Fraction(){
      this.numerator = 0;
      this.denominator = 1;
  }

  public Fraction(long numerator,long denominator){
      this.numerator = numerator;
      this.denominator = denominator;
  }

  public Fraction(long numerator){
      this.numerator = numerator;
      this.denominator = 1;
  }
  //public Fraction(string)

      //methodes 
  //setters
  public void setNumerator(long numerator){
      this.numerator = numerator;
  }

  public void setDenominator(long denominator){
      this.denominator = denominator;
  }
  //getters
  public long numerator(){
      return this.numerator;
  }

  public long denominator(){
      return this.denominator;
  }

  public Fraction add(Fraction f){
      Fraction resultat = new Fraction();
      resultat.setNumerator((this.numerator()*f.denominator())+(this.denominator()*f.numerator()));
      resultat.setDenominator(this.denominator()*f.denominator());
      return resultat;

  }

  public Fraction substract(Fraction f){
      Fraction resultat = new Fraction();
      resultat.setNumerator((this.numerator()*f.denominator())-(this.denominator()*f.numerator()));
      resultat.setDenominator(this.denominator()*f.denominator());
      return resultat;
  }

  public Fraction multiply(Fraction f){
      Fraction resultat = new Fraction();
      resultat.setNumerator(this.numerator()*f.numerator());
      resultat.setDenominator(this.denominator()*f.denominator());
      return resultat;
  }

  public Fraction  divide(Fraction f){
      Fraction resultat = new Fraction();
      resultat.setNumerator(this.numerator()*this.denominator());
      resultat.setDenominator(this.denominator()*f.numerator());
      return resultat;
  }

 // public Boolean equals(Fraction f)
 //private Fraction simplify()
  
  public String toString(){

      return this.numerator+" / "+this.denominator;
  }

} 
public class Fraction {
  private long numerator;
  private long denominator;

  public Fraction(){
    this.denominator = 1;
    this.numerator = 0;
  }

  public Fraction(long numerator, long denominator){
    this.denominator = denominator;
    this.numerator = numerator;
  }

  public Fraction(long denominator){
    this.denominator = denominator;
    this.numerator = 1;
  }
  // setters
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
}

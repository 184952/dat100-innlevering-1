package no.hvl.dat100;

public class O1 {
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    int inntekt = 670100;

	    double trinn0 = 0;
	    double trinn1 = 0.017;
	    double trinn2 = 0.04;
	    double trinn3 = 0.136;
	    double trinn4= 0.166;
	    double trinn5 = 0.176;

	    if (inntekt < 208051) {
	        System.out.print("inntekt");
	    }
	    else if (inntekt <= 292850) {
	        System.out.print((inntekt - 208051) * trinn1); }

	    else if (inntekt <= 670000) {
	        System.out.print((inntekt - 292851) * trinn2); }

	    else if (inntekt <= 937900) {
	        System.out.print((inntekt - 670001)* trinn3); }

	    else if (inntekt <= 1350000) {
	        System.out.print((inntekt - 937901) * trinn4); }

	    else if (inntekt > 1350000) {
	        System.out.print((inntekt - 1350001) * trinn5); }


	    }
	} 



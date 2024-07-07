//*
//**
//***
//****
//*****

//rule 1-for outer loop check rows
//rule 2-for inner loop,check cols and connect to rows
//rule 3-print pattern inside inner loop
//rule 4-check symmetry(optional)

class Pattern2
{
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}

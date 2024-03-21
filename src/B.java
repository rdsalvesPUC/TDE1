public class B {
    public static void main(String args[])
    {
        System.out.println(codificar( "TACGAACTAG" ));
        System.out.println(codificar( "GATMAKETGX" ));
    }
    private static char[] letra_x = { 'A', 'C', 'G', 'T' };
    private static char[] letra_y = { 'R', 'B', 'Z', 'M' };
    private static char codificar(char letra)
    {
        char resposta = '?';
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < letra_x.length)
        {
            if (letra == letra_x[i])
            {
                encontrado = true;
                resposta = letra_y[i];
            }
            else i++;
        }
        return resposta;
    }
    private static String codificar(String palavra)
    {
        String resposta = "";
        for (int i = 0; i < palavra.length(); i++)
        {
            char c = palavra.charAt(i); // i-ésima letra da palavra
            resposta = resposta + codificar(c);
        }
        return resposta;
    }
}
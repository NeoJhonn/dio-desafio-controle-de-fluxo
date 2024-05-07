import java.security.InvalidParameterException;

public class ParametrosInvalidosException extends InvalidParameterException {

    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro!");
    }

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}


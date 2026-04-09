package study.ch21.Ex;

class ShopException extends Exception {
    public ShopException(String message) {
        super(message);
    }
}

class PaymentException extends ShopException {
    public PaymentException(String message) {
        super(message);
    }
}
class OderException extends ShopException {
    public OderException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends PaymentException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class CardExpiredException extends PaymentException{
    public CardExpiredException(String message) {
        super(message);
    }
};

class OutOfException extends OderException{
    public OutOfException(String message) {
        super(message);
    }
};

public class Ex16 {
    public static void main(String[] args) {
        try {
            throw new OutOfException ("재고가 부족합니다.");
    } catch (OutOfException e) {
            e.getMessage();
        }
    }
}
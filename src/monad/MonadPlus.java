import java.util.function.Predicate;
import java.util.function.Function;

public interface MonadPlus<A> extends Monad<A> {

    interface Zero<B> {
	MonadPlus<B> get();
    }

    MonadPlus<A> plus(MonadPlus<A> other);
    
    <B> MonadPlus<B> flatMap(Function<A, Monad<B>> f);

    default MonadPlus<A> filter(Pack<A> pack, Zero<A> zero, Predicate<A> p) {
	return flatMap(a -> p.test(a) ? pack.apply(a) : zero.get());
    }
    
}

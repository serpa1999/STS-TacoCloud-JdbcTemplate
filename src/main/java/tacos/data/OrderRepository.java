package tacos.data;

import java.util.Optional;

import tacos.Domain.TacoOrder;

public interface OrderRepository {
	
	TacoOrder save(TacoOrder order);
	
	Optional<TacoOrder> findById(Long id);

}

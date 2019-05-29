/**
 * 
 */
package sv.com.prontobpo.services;

import java.util.List;

/**
 * @author tony
 *
 */
public interface CRUD<T> {
	
	List<T> findAll();

	T create(T obj);

	T find(Long id);

	T update(T obj);

	void delete(Long id);
}

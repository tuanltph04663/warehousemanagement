package model;

import java.util.List;

public interface IDAO<T> {

	List<T> getAll();

	T findById();

	void insert(T t);

	void update(T t);

	void delete(T t);
}

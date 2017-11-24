package com.bcl.collection;

public class A3_HashMap {
	/*final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
		Node<K, V>[] tab;
		Node<K, V> p;
		int n, i;
		if ((tab = table) == null || (n = tab.length) == 0)
			n = (tab = resize()).length;
		if ((p = tab[i = (n - 1) & hash]) == null)//根据hash计算index，看index上是否有对象
			tab[i] = newNode(hash, key, value, null);//没有对象
		else {
			Node<K, V> e;
			K k;
			//先判断hash是否相等，因为hash不相等(n - 1) & hash计算出的index也可能相等，
			//再判断==
			//再判断equals
			if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
				//都相等就替换
				e = p;
			else if (p instanceof TreeNode)//如果是红黑树
				e = ((TreeNode<K, V>) p).putTreeVal(this, tab, hash, key, value);
			else {
				for (int binCount = 0;; ++binCount) {
					if ((e = p.next) == null) {
						p.next = newNode(hash, key, value, null);
						if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
							//超过8就把链表转为红黑树
							treeifyBin(tab, hash);
						break;
					}
					if (e.hash == hash && ((k = e.key) == key || (key != null && key.equals(k))))
						break;
					p = e;
				}
			}
			if (e != null) { // existing mapping for key
				V oldValue = e.value;
				if (!onlyIfAbsent || oldValue == null)
					e.value = value;
				afterNodeAccess(e);
				return oldValue;
			}
		}
		++modCount;
		if (++size > threshold)
			resize();
		afterNodeInsertion(evict);
		return null;
	}*/
}

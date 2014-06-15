// Import the necessary Java synchronization and scheduling classes.

package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;

/**
 * @class SimpleAtomicLong
 *
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.SimpleAtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class SimpleAtomicLong
{
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;


    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
<<<<<<< HEAD
    // TODO - replace the null with the appropriate initialization:
    private ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock();
=======
    // TODO - add the implementation
>>>>>>> upstream/master

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
<<<<<<< HEAD
    public SimpleAtomicLong(long initialValue)
    {
    	// TODO - you fill in here
    	mValue = initialValue;
=======
    public SimpleAtomicLong(long initialValue) {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Gets the current value
     * 
     * @returns The current value
     */
<<<<<<< HEAD
    public long get()
    {
    	// TODO - you fill in here, using a readLock()
    	final Lock myReadLock = mRWLock.readLock();
    	myReadLock.lock();
        try {
        	return mValue;
        } finally {
        	myReadLock.unlock();
        }
=======
    public long get() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
<<<<<<< HEAD
    public long decrementAndGet()
    {
        // TODO - you fill in here, using a writeLock()
    	final Lock myWriteLock = mRWLock.writeLock();
    	myWriteLock.lock();
        try {
        	return --mValue;
        } finally {
        	myWriteLock.unlock();
        }
=======
    public long decrementAndGet() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
<<<<<<< HEAD
    public long getAndIncrement()
    {
        // TODO - you fill in here, using a writeLock()
    	final Lock myWriteLock = mRWLock.writeLock();
    	myWriteLock.lock();
        try {
        	return mValue++;
        } finally {
        	myWriteLock.unlock();
        }
=======
    public long getAndIncrement() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
<<<<<<< HEAD
    public long getAndDecrement()
    {
        // TODO - you fill in here, using a writeLock()
    	final Lock myWriteLock = mRWLock.writeLock();
    	myWriteLock.lock();
        try {
        	return mValue--;
        } finally {
        	myWriteLock.unlock();
        }
=======
    public long getAndDecrement() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
<<<<<<< HEAD
    public long incrementAndGet()
    {
        // TODO - you fill in here, using a writeLock()
    	final Lock myWriteLock = mRWLock.writeLock();
    	myWriteLock.lock();
        try {
        	return ++mValue;
        } finally {
        	myWriteLock.unlock();
        }
=======
    public long incrementAndGet() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }
}


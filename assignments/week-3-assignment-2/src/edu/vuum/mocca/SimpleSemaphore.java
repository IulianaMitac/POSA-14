package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

/**
 * @class SimpleSemaphore
 * 
 * @brief This class provides a simple counting semaphore
 *        implementation using Java a ReentrantLock and a
 *        ConditionObject (which is accessed via a Condition). It must
 *        implement both "Fair" and "NonFair" semaphore semantics,
 *        just liked Java Semaphores.
 */
public class SimpleSemaphore {
    /**
     * Define a Lock to protect the critical section.
     */
<<<<<<< HEAD
    public SimpleSemaphore (int permits,
                            boolean fair)
    { 
        // TODO - you fill in here
    	this.permits = permits;
    	lock = new ReentrantLock(fair);
    	permitAvailable = lock.newCondition();
    	
    }
=======
    // TODO - you fill in here
>>>>>>> upstream/master

    /**
     * Define a Condition that waits while the number of permits is 0.
     */
<<<<<<< HEAD
    public void acquire() throws InterruptedException {
        // TODO - you fill in here
    	final ReentrantLock lock = this.lock;
    	lock.lockInterruptibly();
    	try {
    		while (permits == 0) 
    			permitAvailable.await();
    		permits--;
    	} finally {
    		lock.unlock();
    	}
    	
    }
=======
    // TODO - you fill in here
>>>>>>> upstream/master

    /**
     * Define a count of the number of available permits.
     */
<<<<<<< HEAD
    public void acquireUninterruptibly() {
        // TODO - you fill in here
    	final ReentrantLock lock = this.lock;
    	lock.lock();
    	try {
    		while (permits == 0) 
    			permitAvailable.awaitUninterruptibly();
    		permits--;
    	} finally {
    		lock.unlock();
    	}
=======
    // TODO - you fill in here.  Make sure that this data member will
    // ensure its values aren't cached by multiple Threads..

    public SimpleSemaphore(int permits, boolean fair) {
        // TODO - you fill in here to initialize the SimpleSemaphore,
        // making sure to allow both fair and non-fair Semaphore
        // semantics.
>>>>>>> upstream/master
    }

    /**
     * Acquire one permit from the semaphore in a manner that can be
     * interrupted.
     */
<<<<<<< HEAD
    void release() {
        // TODO - you fill in here
    	final ReentrantLock lock = this.lock;
    	lock.lock();
    	try {
    		permits++;
    		permitAvailable.signal();
    	} finally {
    		lock.unlock();
    	}
=======
    public void acquire() throws InterruptedException {
        // TODO - you fill in here.
>>>>>>> upstream/master
    }

    /**
     * Acquire one permit from the semaphore in a manner that cannot be
     * interrupted.
     */
<<<<<<< HEAD
    public int availablePermits(){
    	// TODO - you fill in here
    	final ReentrantLock lock = this.lock;
    	try {
    		lock.lock();
    		int availablePermits = permits;
    		return availablePermits;
    	} finally {
    		lock.unlock();
    	}
    }
    
    /**
     * Define a ReentrantLock to protect the critical section.
     */
    // TODO - you fill in here
    private final ReentrantLock lock;
=======
    public void acquireUninterruptibly() {
        // TODO - you fill in here.
    }
>>>>>>> upstream/master

    /**
     * Return one permit to the semaphore.
     */
<<<<<<< HEAD
    // TODO - you fill in here
    private final Condition permitAvailable;
=======
    public void release() {
        // TODO - you fill in here.
    }
>>>>>>> upstream/master

    /**
     * Return the number of permits available.
     */
<<<<<<< HEAD
    // TODO - you fill in here
    private int permits;
=======
    public int availablePermits() {
        // TODO - you fill in here by changing null to the appropriate
        // return value.
        return null;
    }
>>>>>>> upstream/master
}

package frq;

public class CandidatePool
{
 /** The list of all candidates */
 private List<Candidate> pool;
 
 /** Constructs a new CandidatePool object */
 public CandidatePool()
 { pool = new ArrayList<Candidate>(); }
 
 /** Adds candidate to the pool
  *  @param candidate the candidate to add to the pool */
 public void addCandidate(Candidate candidate)
 { pool.add(candidate); }
 
 /** Returns a list of candidates from the pool that have the same position as position
  *  @param position the position of candidates to return
  *  @return a list of candidates that have the desired position */
 public List<Candidate> getCandidatesForPosition(String position)
 { /* to be implemented in part (a) */ }
 
 /** Returns the candidate from the pool with the highest interview score that
  *  has the same position as position or null if position does not match the
  *  position of any candidate.
  *  @param position the position of the candidate to return
  *  @return the candidate for position with the highest interview score or null */
 public Candidate getBestCandidate(String position)
 { /* to be implemented in part (b) */ }
 
 /**
  * Removes all candidates from the pool that have the same position as position.
  * @param position the position of candidates to remove from the pool
  * @return the number of candidates removed from the pool */
 public int removeCandidatesForPosition(String position)
 { /* to be implemented in part (c) */ }
 
 // There may be instance variables, constructors, and methods that are not shown.
}
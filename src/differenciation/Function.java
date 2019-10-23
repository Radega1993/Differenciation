/**
 * 
 */
package differenciation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

public class Function implements IOperations {

	private List<IOperations> IOperationsList = new ArrayList<IOperations>();
	/**
	 * @param args
	 */
	@Override
	public void showFunction() {
		for(IOperations ope:IOperationsList) {
			ope.showFunction();
		}
	}
	
	public void addOperation(IOperations ope) {
		IOperationsList.add(ope);
	}
	
	public void removeOperation(IOperations ope) {
		IOperationsList.remove(ope);
	}

}
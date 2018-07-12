// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import communitycommons.StringUtils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Converts an unencoded file to a base 64 encoded string.
 */
public class Base64EncodeFile extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __file;
	private system.proxies.FileDocument file;

	public Base64EncodeFile(IContext context, IMendixObject file)
	{
		super(context);
		this.__file = file;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		this.file = __file == null ? null : system.proxies.FileDocument.initialize(getContext(), __file);

		// BEGIN USER CODE
		return StringUtils.base64EncodeFile(getContext(), file);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "Base64EncodeFile";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

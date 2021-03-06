/* Copyright 1998, 2005 The Apache Software Foundation or its licensors, as applicable
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package java.lang;


//import org.apache.harmony.luni.util.Msg;

/**
 * This runtime exception is thrown when the a String is indexed with a value
 * less than zero, or greater than or equal to the size of the array.
 */
public class StringIndexOutOfBoundsException extends IndexOutOfBoundsException {

    private static final long serialVersionUID = -6762910422159637258L;

    /**
	 * Constructs a new instance of this class with its walkback filled in.
	 */
	public StringIndexOutOfBoundsException() {
		super();
	}

	/**
	 * Constructs a new instance of this class with its walkback and message
	 * (which is based on the argument which is the index which failed) filled
	 * in.
	 * 
	 * @param index
	 *            int the index which is out of bounds
	 */
	public StringIndexOutOfBoundsException(int index) {
		//super(Msg.getString("K0055", index));
		super("String index out of range: " + index);
	}

	/**
	 * Constructs a new instance of this class with its walkback and message
	 * filled in.
	 * 
	 * @param detailMessage
	 *            String The detail message for the exception.
	 */
	public StringIndexOutOfBoundsException(String detailMessage) {
		super(detailMessage);
	}
}

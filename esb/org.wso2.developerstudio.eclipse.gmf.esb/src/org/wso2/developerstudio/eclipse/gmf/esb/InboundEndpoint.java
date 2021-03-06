/**
 * Copyright 2009-2012 WSO2, Inc. (http://wso2.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.developerstudio.eclipse.gmf.esb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inbound Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getSequenceInputConnector <em>Sequence Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getSequenceOutputConnector <em>Sequence Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getOnErrorSequenceInputConnector <em>On Error Sequence Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getOnErrorSequenceOutputConnector <em>On Error Sequence Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getContainer <em>Container</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getType <em>Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getOnErrorSequence <em>On Error Sequence</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getInboundHttpPort <em>Inbound Http Port</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#isSequential <em>Sequential</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#isCoordination <em>Coordination</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSFileURI <em>Transport VFS File URI</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSContentType <em>Transport VFS Content Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSFileNamePattern <em>Transport VFS File Name Pattern</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSFileProcessInterval <em>Transport VFS File Process Interval</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSFileProcessCount <em>Transport VFS File Process Count</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSLocking <em>Transport VFS Locking</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSMaxRetryCount <em>Transport VFS Max Retry Count</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSReconnectTimeout <em>Transport VFS Reconnect Timeout</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSActionAfterProcess <em>Transport VFS Action After Process</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSMoveAfterProcess <em>Transport VFS Move After Process</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSActionAfterErrors <em>Transport VFS Action After Errors</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSMoveAfterErrors <em>Transport VFS Move After Errors</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSActionAfterFailure <em>Transport VFS Action After Failure</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSMoveAfterFailure <em>Transport VFS Move After Failure</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#isTransportVFSAutoLockRelease <em>Transport VFS Auto Lock Release</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSAutoLockReleaseInterval <em>Transport VFS Auto Lock Release Interval</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#isTransportVFSLockReleaseSameNode <em>Transport VFS Lock Release Same Node</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#isTransportVFSDistributedLock <em>Transport VFS Distributed Lock</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSDistributedTimeout <em>Transport VFS Distributed Timeout</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getJavaNamingFactoryInitial <em>Java Naming Factory Initial</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getJavaNamingProviderUrl <em>Java Naming Provider Url</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSConnectionFactoryJNDIName <em>Transport JMS Connection Factory JNDI Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSConnectionFactoryType <em>Transport JMS Connection Factory Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSDestination <em>Transport JMS Destination</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#isTransportJMSSessionTransacted <em>Transport JMS Session Transacted</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSSessionAcknowledgement <em>Transport JMS Session Acknowledgement</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSCacheLevel <em>Transport JMS Cache Level</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSUserName <em>Transport JMS User Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSPassword <em>Transport JMS Password</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSJMSSpecVersion <em>Transport JMSJMS Spec Version</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSSubscriptionDurable <em>Transport JMS Subscription Durable</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSDurableSubscriberClientID <em>Transport JMS Durable Subscriber Client ID</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSMessageSelector <em>Transport JMS Message Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint()
 * @model
 * @generated
 */
public interface InboundEndpoint extends EsbElement {
	/**
	 * Returns the value of the '<em><b>Sequence Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Input Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Input Connector</em>' containment reference.
	 * @see #setSequenceInputConnector(InboundEndpointSequenceInputConnector)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_SequenceInputConnector()
	 * @model containment="true"
	 * @generated
	 */
	InboundEndpointSequenceInputConnector getSequenceInputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getSequenceInputConnector <em>Sequence Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Input Connector</em>' containment reference.
	 * @see #getSequenceInputConnector()
	 * @generated
	 */
	void setSequenceInputConnector(InboundEndpointSequenceInputConnector value);

	/**
	 * Returns the value of the '<em><b>Sequence Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Output Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Output Connector</em>' containment reference.
	 * @see #setSequenceOutputConnector(InboundEndpointSequenceOutputConnector)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_SequenceOutputConnector()
	 * @model containment="true"
	 * @generated
	 */
	InboundEndpointSequenceOutputConnector getSequenceOutputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getSequenceOutputConnector <em>Sequence Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Output Connector</em>' containment reference.
	 * @see #getSequenceOutputConnector()
	 * @generated
	 */
	void setSequenceOutputConnector(InboundEndpointSequenceOutputConnector value);

	/**
	 * Returns the value of the '<em><b>On Error Sequence Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Error Sequence Input Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Error Sequence Input Connector</em>' containment reference.
	 * @see #setOnErrorSequenceInputConnector(InboundEndpointOnErrorSequenceInputConnector)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_OnErrorSequenceInputConnector()
	 * @model containment="true"
	 * @generated
	 */
	InboundEndpointOnErrorSequenceInputConnector getOnErrorSequenceInputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getOnErrorSequenceInputConnector <em>On Error Sequence Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Error Sequence Input Connector</em>' containment reference.
	 * @see #getOnErrorSequenceInputConnector()
	 * @generated
	 */
	void setOnErrorSequenceInputConnector(InboundEndpointOnErrorSequenceInputConnector value);

	/**
	 * Returns the value of the '<em><b>On Error Sequence Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Error Sequence Output Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Error Sequence Output Connector</em>' containment reference.
	 * @see #setOnErrorSequenceOutputConnector(InboundEndpointOnErrorSequenceOutputConnector)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_OnErrorSequenceOutputConnector()
	 * @model containment="true"
	 * @generated
	 */
	InboundEndpointOnErrorSequenceOutputConnector getOnErrorSequenceOutputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getOnErrorSequenceOutputConnector <em>On Error Sequence Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Error Sequence Output Connector</em>' containment reference.
	 * @see #getOnErrorSequenceOutputConnector()
	 * @generated
	 */
	void setOnErrorSequenceOutputConnector(InboundEndpointOnErrorSequenceOutputConnector value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(InboundEndpointContainer)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_Container()
	 * @model containment="true"
	 * @generated
	 */
	InboundEndpointContainer getContainer();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(InboundEndpointContainer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpointType
	 * @see #setType(InboundEndpointType)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_Type()
	 * @model
	 * @generated
	 */
	InboundEndpointType getType();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpointType
	 * @see #getType()
	 * @generated
	 */
	void setType(InboundEndpointType value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_Sequence()
	 * @model
	 * @generated
	 */
	String getSequence();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(String value);

	/**
	 * Returns the value of the '<em><b>On Error Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Error Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Error Sequence</em>' attribute.
	 * @see #setOnErrorSequence(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_OnErrorSequence()
	 * @model
	 * @generated
	 */
	String getOnErrorSequence();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getOnErrorSequence <em>On Error Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Error Sequence</em>' attribute.
	 * @see #getOnErrorSequence()
	 * @generated
	 */
	void setOnErrorSequence(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Inbound Http Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Http Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Http Port</em>' attribute.
	 * @see #setInboundHttpPort(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_InboundHttpPort()
	 * @model
	 * @generated
	 */
	String getInboundHttpPort();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getInboundHttpPort <em>Inbound Http Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound Http Port</em>' attribute.
	 * @see #getInboundHttpPort()
	 * @generated
	 */
	void setInboundHttpPort(String value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_Interval()
	 * @model
	 * @generated
	 */
	String getInterval();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(String value);

	/**
	 * Returns the value of the '<em><b>Sequential</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequential</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequential</em>' attribute.
	 * @see #setSequential(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_Sequential()
	 * @model default="true"
	 * @generated
	 */
	boolean isSequential();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#isSequential <em>Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequential</em>' attribute.
	 * @see #isSequential()
	 * @generated
	 */
	void setSequential(boolean value);

	/**
	 * Returns the value of the '<em><b>Coordination</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination</em>' attribute.
	 * @see #setCoordination(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_Coordination()
	 * @model default="true"
	 * @generated
	 */
	boolean isCoordination();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#isCoordination <em>Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination</em>' attribute.
	 * @see #isCoordination()
	 * @generated
	 */
	void setCoordination(boolean value);

	/**
	 * Returns the value of the '<em><b>Transport VFS File URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS File URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS File URI</em>' attribute.
	 * @see #setTransportVFSFileURI(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSFileURI()
	 * @model
	 * @generated
	 */
	String getTransportVFSFileURI();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSFileURI <em>Transport VFS File URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS File URI</em>' attribute.
	 * @see #getTransportVFSFileURI()
	 * @generated
	 */
	void setTransportVFSFileURI(String value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Content Type</em>' attribute.
	 * @see #setTransportVFSContentType(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSContentType()
	 * @model
	 * @generated
	 */
	String getTransportVFSContentType();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSContentType <em>Transport VFS Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Content Type</em>' attribute.
	 * @see #getTransportVFSContentType()
	 * @generated
	 */
	void setTransportVFSContentType(String value);

	/**
	 * Returns the value of the '<em><b>Transport VFS File Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS File Name Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS File Name Pattern</em>' attribute.
	 * @see #setTransportVFSFileNamePattern(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSFileNamePattern()
	 * @model
	 * @generated
	 */
	String getTransportVFSFileNamePattern();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSFileNamePattern <em>Transport VFS File Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS File Name Pattern</em>' attribute.
	 * @see #getTransportVFSFileNamePattern()
	 * @generated
	 */
	void setTransportVFSFileNamePattern(String value);

	/**
	 * Returns the value of the '<em><b>Transport VFS File Process Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS File Process Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS File Process Interval</em>' attribute.
	 * @see #setTransportVFSFileProcessInterval(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSFileProcessInterval()
	 * @model
	 * @generated
	 */
	String getTransportVFSFileProcessInterval();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSFileProcessInterval <em>Transport VFS File Process Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS File Process Interval</em>' attribute.
	 * @see #getTransportVFSFileProcessInterval()
	 * @generated
	 */
	void setTransportVFSFileProcessInterval(String value);

	/**
	 * Returns the value of the '<em><b>Transport VFS File Process Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS File Process Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS File Process Count</em>' attribute.
	 * @see #setTransportVFSFileProcessCount(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSFileProcessCount()
	 * @model
	 * @generated
	 */
	String getTransportVFSFileProcessCount();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSFileProcessCount <em>Transport VFS File Process Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS File Process Count</em>' attribute.
	 * @see #getTransportVFSFileProcessCount()
	 * @generated
	 */
	void setTransportVFSFileProcessCount(String value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Locking</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.Enable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Locking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Locking</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Enable
	 * @see #setTransportVFSLocking(Enable)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSLocking()
	 * @model
	 * @generated
	 */
	Enable getTransportVFSLocking();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSLocking <em>Transport VFS Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Locking</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.Enable
	 * @see #getTransportVFSLocking()
	 * @generated
	 */
	void setTransportVFSLocking(Enable value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Max Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Max Retry Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Max Retry Count</em>' attribute.
	 * @see #setTransportVFSMaxRetryCount(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSMaxRetryCount()
	 * @model
	 * @generated
	 */
	String getTransportVFSMaxRetryCount();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSMaxRetryCount <em>Transport VFS Max Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Max Retry Count</em>' attribute.
	 * @see #getTransportVFSMaxRetryCount()
	 * @generated
	 */
	void setTransportVFSMaxRetryCount(String value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Reconnect Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Reconnect Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Reconnect Timeout</em>' attribute.
	 * @see #setTransportVFSReconnectTimeout(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSReconnectTimeout()
	 * @model
	 * @generated
	 */
	String getTransportVFSReconnectTimeout();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSReconnectTimeout <em>Transport VFS Reconnect Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Reconnect Timeout</em>' attribute.
	 * @see #getTransportVFSReconnectTimeout()
	 * @generated
	 */
	void setTransportVFSReconnectTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Action After Process</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.VFSAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Action After Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Action After Process</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.VFSAction
	 * @see #setTransportVFSActionAfterProcess(VFSAction)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSActionAfterProcess()
	 * @model
	 * @generated
	 */
	VFSAction getTransportVFSActionAfterProcess();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSActionAfterProcess <em>Transport VFS Action After Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Action After Process</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.VFSAction
	 * @see #getTransportVFSActionAfterProcess()
	 * @generated
	 */
	void setTransportVFSActionAfterProcess(VFSAction value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Move After Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Move After Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Move After Process</em>' attribute.
	 * @see #setTransportVFSMoveAfterProcess(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSMoveAfterProcess()
	 * @model
	 * @generated
	 */
	String getTransportVFSMoveAfterProcess();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSMoveAfterProcess <em>Transport VFS Move After Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Move After Process</em>' attribute.
	 * @see #getTransportVFSMoveAfterProcess()
	 * @generated
	 */
	void setTransportVFSMoveAfterProcess(String value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Action After Errors</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.VFSAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Action After Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Action After Errors</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.VFSAction
	 * @see #setTransportVFSActionAfterErrors(VFSAction)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSActionAfterErrors()
	 * @model
	 * @generated
	 */
	VFSAction getTransportVFSActionAfterErrors();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSActionAfterErrors <em>Transport VFS Action After Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Action After Errors</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.VFSAction
	 * @see #getTransportVFSActionAfterErrors()
	 * @generated
	 */
	void setTransportVFSActionAfterErrors(VFSAction value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Move After Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Move After Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Move After Errors</em>' attribute.
	 * @see #setTransportVFSMoveAfterErrors(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSMoveAfterErrors()
	 * @model
	 * @generated
	 */
	String getTransportVFSMoveAfterErrors();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSMoveAfterErrors <em>Transport VFS Move After Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Move After Errors</em>' attribute.
	 * @see #getTransportVFSMoveAfterErrors()
	 * @generated
	 */
	void setTransportVFSMoveAfterErrors(String value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Action After Failure</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.VFSAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Action After Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Action After Failure</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.VFSAction
	 * @see #setTransportVFSActionAfterFailure(VFSAction)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSActionAfterFailure()
	 * @model
	 * @generated
	 */
	VFSAction getTransportVFSActionAfterFailure();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSActionAfterFailure <em>Transport VFS Action After Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Action After Failure</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.VFSAction
	 * @see #getTransportVFSActionAfterFailure()
	 * @generated
	 */
	void setTransportVFSActionAfterFailure(VFSAction value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Move After Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Move After Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Move After Failure</em>' attribute.
	 * @see #setTransportVFSMoveAfterFailure(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSMoveAfterFailure()
	 * @model
	 * @generated
	 */
	String getTransportVFSMoveAfterFailure();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSMoveAfterFailure <em>Transport VFS Move After Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Move After Failure</em>' attribute.
	 * @see #getTransportVFSMoveAfterFailure()
	 * @generated
	 */
	void setTransportVFSMoveAfterFailure(String value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Auto Lock Release</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Auto Lock Release</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Auto Lock Release</em>' attribute.
	 * @see #setTransportVFSAutoLockRelease(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSAutoLockRelease()
	 * @model default="true"
	 * @generated
	 */
	boolean isTransportVFSAutoLockRelease();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#isTransportVFSAutoLockRelease <em>Transport VFS Auto Lock Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Auto Lock Release</em>' attribute.
	 * @see #isTransportVFSAutoLockRelease()
	 * @generated
	 */
	void setTransportVFSAutoLockRelease(boolean value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Auto Lock Release Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Auto Lock Release Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Auto Lock Release Interval</em>' attribute.
	 * @see #setTransportVFSAutoLockReleaseInterval(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSAutoLockReleaseInterval()
	 * @model
	 * @generated
	 */
	String getTransportVFSAutoLockReleaseInterval();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSAutoLockReleaseInterval <em>Transport VFS Auto Lock Release Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Auto Lock Release Interval</em>' attribute.
	 * @see #getTransportVFSAutoLockReleaseInterval()
	 * @generated
	 */
	void setTransportVFSAutoLockReleaseInterval(String value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Lock Release Same Node</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Lock Release Same Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Lock Release Same Node</em>' attribute.
	 * @see #setTransportVFSLockReleaseSameNode(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSLockReleaseSameNode()
	 * @model default="true"
	 * @generated
	 */
	boolean isTransportVFSLockReleaseSameNode();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#isTransportVFSLockReleaseSameNode <em>Transport VFS Lock Release Same Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Lock Release Same Node</em>' attribute.
	 * @see #isTransportVFSLockReleaseSameNode()
	 * @generated
	 */
	void setTransportVFSLockReleaseSameNode(boolean value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Distributed Lock</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Distributed Lock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Distributed Lock</em>' attribute.
	 * @see #setTransportVFSDistributedLock(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSDistributedLock()
	 * @model default="true"
	 * @generated
	 */
	boolean isTransportVFSDistributedLock();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#isTransportVFSDistributedLock <em>Transport VFS Distributed Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Distributed Lock</em>' attribute.
	 * @see #isTransportVFSDistributedLock()
	 * @generated
	 */
	void setTransportVFSDistributedLock(boolean value);

	/**
	 * Returns the value of the '<em><b>Transport VFS Distributed Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport VFS Distributed Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport VFS Distributed Timeout</em>' attribute.
	 * @see #setTransportVFSDistributedTimeout(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportVFSDistributedTimeout()
	 * @model
	 * @generated
	 */
	String getTransportVFSDistributedTimeout();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportVFSDistributedTimeout <em>Transport VFS Distributed Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport VFS Distributed Timeout</em>' attribute.
	 * @see #getTransportVFSDistributedTimeout()
	 * @generated
	 */
	void setTransportVFSDistributedTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Java Naming Factory Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Naming Factory Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Naming Factory Initial</em>' attribute.
	 * @see #setJavaNamingFactoryInitial(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_JavaNamingFactoryInitial()
	 * @model
	 * @generated
	 */
	String getJavaNamingFactoryInitial();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getJavaNamingFactoryInitial <em>Java Naming Factory Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Naming Factory Initial</em>' attribute.
	 * @see #getJavaNamingFactoryInitial()
	 * @generated
	 */
	void setJavaNamingFactoryInitial(String value);

	/**
	 * Returns the value of the '<em><b>Java Naming Provider Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Naming Provider Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Naming Provider Url</em>' attribute.
	 * @see #setJavaNamingProviderUrl(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_JavaNamingProviderUrl()
	 * @model
	 * @generated
	 */
	String getJavaNamingProviderUrl();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getJavaNamingProviderUrl <em>Java Naming Provider Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Naming Provider Url</em>' attribute.
	 * @see #getJavaNamingProviderUrl()
	 * @generated
	 */
	void setJavaNamingProviderUrl(String value);

	/**
	 * Returns the value of the '<em><b>Transport JMS Connection Factory JNDI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport JMS Connection Factory JNDI Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport JMS Connection Factory JNDI Name</em>' attribute.
	 * @see #setTransportJMSConnectionFactoryJNDIName(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportJMSConnectionFactoryJNDIName()
	 * @model
	 * @generated
	 */
	String getTransportJMSConnectionFactoryJNDIName();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSConnectionFactoryJNDIName <em>Transport JMS Connection Factory JNDI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport JMS Connection Factory JNDI Name</em>' attribute.
	 * @see #getTransportJMSConnectionFactoryJNDIName()
	 * @generated
	 */
	void setTransportJMSConnectionFactoryJNDIName(String value);

	/**
	 * Returns the value of the '<em><b>Transport JMS Connection Factory Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.JMSConnectionFactoryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport JMS Connection Factory Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport JMS Connection Factory Type</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.JMSConnectionFactoryType
	 * @see #setTransportJMSConnectionFactoryType(JMSConnectionFactoryType)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportJMSConnectionFactoryType()
	 * @model
	 * @generated
	 */
	JMSConnectionFactoryType getTransportJMSConnectionFactoryType();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSConnectionFactoryType <em>Transport JMS Connection Factory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport JMS Connection Factory Type</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.JMSConnectionFactoryType
	 * @see #getTransportJMSConnectionFactoryType()
	 * @generated
	 */
	void setTransportJMSConnectionFactoryType(JMSConnectionFactoryType value);

	/**
	 * Returns the value of the '<em><b>Transport JMS Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport JMS Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport JMS Destination</em>' attribute.
	 * @see #setTransportJMSDestination(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportJMSDestination()
	 * @model
	 * @generated
	 */
	String getTransportJMSDestination();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSDestination <em>Transport JMS Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport JMS Destination</em>' attribute.
	 * @see #getTransportJMSDestination()
	 * @generated
	 */
	void setTransportJMSDestination(String value);

	/**
	 * Returns the value of the '<em><b>Transport JMS Session Transacted</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport JMS Session Transacted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport JMS Session Transacted</em>' attribute.
	 * @see #setTransportJMSSessionTransacted(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportJMSSessionTransacted()
	 * @model default="true"
	 * @generated
	 */
	boolean isTransportJMSSessionTransacted();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#isTransportJMSSessionTransacted <em>Transport JMS Session Transacted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport JMS Session Transacted</em>' attribute.
	 * @see #isTransportJMSSessionTransacted()
	 * @generated
	 */
	void setTransportJMSSessionTransacted(boolean value);

	/**
	 * Returns the value of the '<em><b>Transport JMS Session Acknowledgement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.JMSSessionAcknowledgement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport JMS Session Acknowledgement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport JMS Session Acknowledgement</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.JMSSessionAcknowledgement
	 * @see #setTransportJMSSessionAcknowledgement(JMSSessionAcknowledgement)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportJMSSessionAcknowledgement()
	 * @model
	 * @generated
	 */
	JMSSessionAcknowledgement getTransportJMSSessionAcknowledgement();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSSessionAcknowledgement <em>Transport JMS Session Acknowledgement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport JMS Session Acknowledgement</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.JMSSessionAcknowledgement
	 * @see #getTransportJMSSessionAcknowledgement()
	 * @generated
	 */
	void setTransportJMSSessionAcknowledgement(JMSSessionAcknowledgement value);

	/**
	 * Returns the value of the '<em><b>Transport JMS Cache Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.JMSCacheLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport JMS Cache Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport JMS Cache Level</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.JMSCacheLevel
	 * @see #setTransportJMSCacheLevel(JMSCacheLevel)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportJMSCacheLevel()
	 * @model
	 * @generated
	 */
	JMSCacheLevel getTransportJMSCacheLevel();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSCacheLevel <em>Transport JMS Cache Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport JMS Cache Level</em>' attribute.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.JMSCacheLevel
	 * @see #getTransportJMSCacheLevel()
	 * @generated
	 */
	void setTransportJMSCacheLevel(JMSCacheLevel value);

	/**
	 * Returns the value of the '<em><b>Transport JMS User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport JMS User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport JMS User Name</em>' attribute.
	 * @see #setTransportJMSUserName(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportJMSUserName()
	 * @model
	 * @generated
	 */
	String getTransportJMSUserName();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSUserName <em>Transport JMS User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport JMS User Name</em>' attribute.
	 * @see #getTransportJMSUserName()
	 * @generated
	 */
	void setTransportJMSUserName(String value);

	/**
	 * Returns the value of the '<em><b>Transport JMS Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport JMS Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport JMS Password</em>' attribute.
	 * @see #setTransportJMSPassword(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportJMSPassword()
	 * @model
	 * @generated
	 */
	String getTransportJMSPassword();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSPassword <em>Transport JMS Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport JMS Password</em>' attribute.
	 * @see #getTransportJMSPassword()
	 * @generated
	 */
	void setTransportJMSPassword(String value);

	/**
	 * Returns the value of the '<em><b>Transport JMSJMS Spec Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport JMSJMS Spec Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport JMSJMS Spec Version</em>' attribute.
	 * @see #setTransportJMSJMSSpecVersion(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportJMSJMSSpecVersion()
	 * @model
	 * @generated
	 */
	String getTransportJMSJMSSpecVersion();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSJMSSpecVersion <em>Transport JMSJMS Spec Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport JMSJMS Spec Version</em>' attribute.
	 * @see #getTransportJMSJMSSpecVersion()
	 * @generated
	 */
	void setTransportJMSJMSSpecVersion(String value);

	/**
	 * Returns the value of the '<em><b>Transport JMS Subscription Durable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport JMS Subscription Durable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport JMS Subscription Durable</em>' attribute.
	 * @see #setTransportJMSSubscriptionDurable(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportJMSSubscriptionDurable()
	 * @model
	 * @generated
	 */
	String getTransportJMSSubscriptionDurable();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSSubscriptionDurable <em>Transport JMS Subscription Durable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport JMS Subscription Durable</em>' attribute.
	 * @see #getTransportJMSSubscriptionDurable()
	 * @generated
	 */
	void setTransportJMSSubscriptionDurable(String value);

	/**
	 * Returns the value of the '<em><b>Transport JMS Durable Subscriber Client ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport JMS Durable Subscriber Client ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport JMS Durable Subscriber Client ID</em>' attribute.
	 * @see #setTransportJMSDurableSubscriberClientID(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportJMSDurableSubscriberClientID()
	 * @model
	 * @generated
	 */
	String getTransportJMSDurableSubscriberClientID();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSDurableSubscriberClientID <em>Transport JMS Durable Subscriber Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport JMS Durable Subscriber Client ID</em>' attribute.
	 * @see #getTransportJMSDurableSubscriberClientID()
	 * @generated
	 */
	void setTransportJMSDurableSubscriberClientID(String value);

	/**
	 * Returns the value of the '<em><b>Transport JMS Message Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport JMS Message Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport JMS Message Selector</em>' attribute.
	 * @see #setTransportJMSMessageSelector(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getInboundEndpoint_TransportJMSMessageSelector()
	 * @model
	 * @generated
	 */
	String getTransportJMSMessageSelector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint#getTransportJMSMessageSelector <em>Transport JMS Message Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport JMS Message Selector</em>' attribute.
	 * @see #getTransportJMSMessageSelector()
	 * @generated
	 */
	void setTransportJMSMessageSelector(String value);

} // InboundEndpoint

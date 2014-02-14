/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.developerstudio.eclipse.esb.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.wso2.developerstudio.eclipse.esb.EndPoint;
import org.wso2.developerstudio.eclipse.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.esb.FailoverEndPoint;

/**
 * This is the item provider adapter for a {@link org.wso2.developerstudio.eclipse.esb.FailoverEndPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FailoverEndPointItemProvider
    extends ParentEndPointItemProvider
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FailoverEndPointItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        super.getPropertyDescriptors(object);
        
        return itemPropertyDescriptors;
    }

    /**
	 * This returns FailoverEndPoint.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
    @Override
				public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FailoverEndPoint"));
	}

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    
    public String getText(Object object) {
    	EndPoint endpoint = (EndPoint) object;
    	String name = endpoint.isAnonymous() ? getString("_UI_Anonymous_label") : endpoint.getEndpointName();
        return String.format("%s [%s]", name, getString("_UI_FailoverEndPoint_qualifier"));
    }

    /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
    @Override
				public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    	newChildDescriptors.add
        (createChildParameter
            (EsbPackage.Literals.PARENT_END_POINT__CHILDREN,
             EsbFactory.eINSTANCE.createAddressEndPoint()));

    	newChildDescriptors.add
        (createChildParameter
            (EsbPackage.Literals.PARENT_END_POINT__CHILDREN,
             EsbFactory.eINSTANCE.createWsdlEndPoint()));

    	newChildDescriptors.add
        (createChildParameter
            (EsbPackage.Literals.PARENT_END_POINT__CHILDREN,
             EsbFactory.eINSTANCE.createFailoverEndPoint()));

    	newChildDescriptors.add
        (createChildParameter
            (EsbPackage.Literals.PARENT_END_POINT__CHILDREN,
             EsbFactory.eINSTANCE.createLoadBalanceEndPoint()));
    	
    	newChildDescriptors.add
        (createChildParameter
            (EsbPackage.Literals.PARENT_END_POINT__CHILDREN,
             EsbFactory.eINSTANCE.createDynamicLoadBalanceEndPoint()));
    }    
}
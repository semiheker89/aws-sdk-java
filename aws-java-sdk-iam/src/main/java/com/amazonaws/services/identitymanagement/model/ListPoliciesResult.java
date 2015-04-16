/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful ListPolicies request.
 * </p>
 */
public class ListPoliciesResult implements Serializable, Cloneable {

    /**
     * A list of policies.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Policy> policies;

    /**
     * A flag that indicates whether there are more policies to list. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * policies in the list.
     */
    private Boolean isTruncated;

    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     */
    private String marker;

    /**
     * A list of policies.
     *
     * @return A list of policies.
     */
    public java.util.List<Policy> getPolicies() {
        if (policies == null) {
              policies = new com.amazonaws.internal.ListWithAutoConstructFlag<Policy>();
              policies.setAutoConstruct(true);
        }
        return policies;
    }
    
    /**
     * A list of policies.
     *
     * @param policies A list of policies.
     */
    public void setPolicies(java.util.Collection<Policy> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Policy> policiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Policy>(policies.size());
        policiesCopy.addAll(policies);
        this.policies = policiesCopy;
    }
    
    /**
     * A list of policies.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicies(java.util.Collection)} or {@link
     * #withPolicies(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policies A list of policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPoliciesResult withPolicies(Policy... policies) {
        if (getPolicies() == null) setPolicies(new java.util.ArrayList<Policy>(policies.length));
        for (Policy value : policies) {
            getPolicies().add(value);
        }
        return this;
    }
    
    /**
     * A list of policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policies A list of policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPoliciesResult withPolicies(java.util.Collection<Policy> policies) {
        if (policies == null) {
            this.policies = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Policy> policiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Policy>(policies.size());
            policiesCopy.addAll(policies);
            this.policies = policiesCopy;
        }

        return this;
    }

    /**
     * A flag that indicates whether there are more policies to list. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * policies in the list.
     *
     * @return A flag that indicates whether there are more policies to list. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         policies in the list.
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more policies to list. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * policies in the list.
     *
     * @param isTruncated A flag that indicates whether there are more policies to list. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         policies in the list.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more policies to list. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * policies in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more policies to list. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         policies in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPoliciesResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more policies to list. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * policies in the list.
     *
     * @return A flag that indicates whether there are more policies to list. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         policies in the list.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @return If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPoliciesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicies() != null) sb.append("Policies: " + getPolicies() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPoliciesResult == false) return false;
        ListPoliciesResult other = (ListPoliciesResult)obj;
        
        if (other.getPolicies() == null ^ this.getPolicies() == null) return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public ListPoliciesResult clone() {
        try {
            return (ListPoliciesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
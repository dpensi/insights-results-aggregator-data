{"OrgID" 77379069 "AccountNumber" 29366764 "ClusterName" "4aa583e2-6fde-4031-b883-569e855a7666" "LastChecked" "2020-04-02T09:00:05.268294Z" "Version" 2 "Report" {"system" {"metadata" {} "hostname" nil} "reports" [{"rule_id" "foo_check|ERROR_KEY" "component" "ccx_rules_ocp.ocs.operator_phase_check.report" "type" "rule" "key" "ERROR_KEY" "details" {"type" "rule" "error_key" "ERROR_KEY"} "tags" [] "links" {}} {"rule_id" "foo_check|ERROR_KEY" "component" "ccx_rules_ocp.ocs.pvc_phase_check.report" "type" "rule" "key" "ERROR_KEY" "details" {"type" "rule" "error_key" "ERROR_KEY"} "tags" [] "links" {}} {"rule_id" "foo_check|ERROR_KEY" "component" "ccx_rules_ocp.ocs.ceph_check_mon_clock_skew.report" "type" "rule" "key" "ERROR_KEY" "details" {"type" "rule" "error_key" "ERROR_KEY"} "tags" [] "links" {}} {"rule_id" "foo_check|ERROR_KEY" "component" "ccx_rules_ocp.ocs.check_pods_scc.report" "type" "rule" "key" "ERROR_KEY" "details" {"type" "rule" "error_key" "ERROR_KEY"} "tags" [] "links" {}} {"rule_id" "foo_check|ERROR_KEY" "component" "ccx_rules_ocp.ocs.check_ocs_version.report" "type" "rule" "key" "ERROR_KEY" "details" {"type" "rule" "error_key" "ERROR_KEY"} "tags" [] "links" {}} {"rule_id" "nodes_requirements_check|NODES_MINIMUM_REQUIREMENTS_NOT_MET" "component" "ccx_rules_ocp.external.rules.nodes_requirements_check.report" "type" "rule" "key" "NODES_MINIMUM_REQUIREMENTS_NOT_MET" "details" {"nodes" [{"name" "foo1" "role" "master" "memory" 8.16 "memory_req" 16}] "link" "https://docs.openshift.com/container-platform/4.1/installing/installing_bare_metal/installing-bare-metal.html#minimum-resource-requirements_installing-bare-metal" "type" "rule" "error_key" "NODES_MINIMUM_REQUIREMENTS_NOT_MET"} "tags" [] "links" {"docs" ["https://docs.openshift.com/container-platform/4.1/installing/installing_bare_metal/installing-bare-metal.html#minimum-resource-requirements_installing-bare-metal"]}} {"rule_id" "bug_1766907|BUGZILLA_BUG_1766907" "component" "ccx_rules_ocp.external.bug_rules.bug_1766907.report" "type" "rule" "key" "BUGZILLA_BUG_1766907" "details" {"type" "rule" "error_key" "BUGZILLA_BUG_1766907"} "tags" [] "links" {"kcs" ["https://access.redhat.com/solutions/4631541"] "doc" [] "bz" ["https://bugzilla.redhat.com/show_bug.cgi?id=1766907"]}} {"rule_id" "nodes_kubelet_version_check|NODE_KUBELET_VERSION" "component" "ccx_rules_ocp.external.rules.nodes_kubelet_version_check.report" "type" "rule" "key" "NODE_KUBELET_VERSION" "details" {"nodes_with_different_version" [{"Node" "oc1" "Kubelet Version" "v1.14.6+0a21dd3b3" "role" "worker"} {"Node" "oc2" "Kubelet Version" "v1.14.6+0a21dd3b3" "role" "worker"} {"Node" "oc3" "Kubelet Version" "v1.14.6+d39ad8449" "role" "worker"}] "kcs_link" "https://access.redhat.com/solutions/4602641" "type" "rule" "error_key" "NODE_KUBELET_VERSION"} "tags" [] "links" {"kcs" ["https://access.redhat.com/solutions/4602641"]}} {"rule_id" "samples_op_failed_image_import_check|SAMPLES_FAILED_IMAGE_IMPORT_ERR" "component" "ccx_rules_ocp.external.rules.samples_op_failed_image_import_check.report" "type" "rule" "key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR" "details" {"info" {"name" "openshift-samples" "condition" "Degraded" "reason" "FailedImageImports" "message" "Samples installed at 4.2.0, with image import failures for these imagestreams: php " "lastTransitionTime" "2020-03-19T08:32:53Z"} "kcs" "https://access.redhat.com/solutions/4563171" "type" "rule" "error_key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR"} "tags" [] "links" {"kcs" ["https://access.redhat.com/solutions/4563171"]}} {"rule_id" "cluster_wide_proxy_auth_check|AUTH_OPERATOR_PROXY_ERROR" "component" "ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.report" "type" "rule" "key" "AUTH_OPERATOR_PROXY_ERROR" "details" {"op" {"available" {"message" nil "reason" "NoData" "status" nil "last_trans_time" "2020-03-31T08:39:51Z"} "degraded" {"message" "WellKnownEndpointDegraded: failed to GET well-known https://10.237.112.145:6443/.well-known/oauth-authorization-server: Tunnel or SSL Forbidden" "reason" "WellKnownEndpointDegradedError" "status" true "last_trans_time" "2020-03-31T08:42:33Z"} "name" "authentication" "progressing" {"message" nil "reason" "NoData" "status" nil "last_trans_time" "2020-03-31T08:39:51Z"} "upgradeable" {"message" nil "reason" "AsExpected" "status" true "last_trans_time" "2020-03-31T08:39:51Z"} "version" nil} "kcs" "https://access.redhat.com/solutions/4569191" "type" "rule" "error_key" "AUTH_OPERATOR_PROXY_ERROR"} "tags" [] "links" {"kcs" ["https://access.redhat.com/solutions/4569191"]}}] "fingerprints" [] "skips" [{"rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1801300.report" "reason" "MISSING_REQUIREMENTS" "details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: " "type" "skip"} {"rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1802248.report" "reason" "MISSING_REQUIREMENTS" "details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: " "type" "skip"} {"rule_fqdn" "ccx_rules_ocp.external.rules.image_registry_pv_no_access.report" "reason" "MISSING_REQUIREMENTS" "details" "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: " "type" "skip"} {"rule_fqdn" "ccx_rules_ocp.external.rules.image_registry_pv_low_capacity.report" "reason" "MISSING_REQUIREMENTS" "details" "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: " "type" "skip"} {"rule_fqdn" "ccx_rules_ocp.external.rules.image_registry_no_volume_set_check.report" "reason" "MISSING_REQUIREMENTS" "details" "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.isImageRegistryPodEmptyDirVolume', 'ccx_rules_ocp.common.conditions.image_registry.isImageRegistryPodPersistentVolume'] Any: " "type" "skip"} {"rule_fqdn" "ccx_rules_ocp.external.rules.image_registry_pv_not_bound.report" "reason" "MISSING_REQUIREMENTS" "details" "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: " "type" "skip"}] "info" [] "pass" []}}

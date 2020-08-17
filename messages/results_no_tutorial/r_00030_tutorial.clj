{"ClusterName" "5d5892d3-1f74-4ccf-91af-548dfc9767aa",
 "LastChecked" "2020-04-02T09:00:05.268294Z",
 "OrgID" 11789772,
 "Report"
   {"fingerprints" [],
    "info" [],
    "pass" [],
    "reports"
      [{"component" "ccx_rules_ocp.external.rules.tutorial_rule.report",
              "details" {"error_key" "TUTORIAL_ERROR", "type" "rule"},
              "key" "TUTORIAL_ERROR",
              "links" {},
              "rule_id" "tutorial_rule|TUTORIAL_ERROR",
              "tags" [],
              "type" "rule"} {"component"
                                      "ccx_rules_ocp.external.rules.nodes_requirements_check.report",
                                    "details"
                                      {"error_key" "NODES_MINIMUM_REQUIREMENTS_NOT_MET",
                                       "link"
                                         "https://docs.openshift.com/container-platform/4.1/installing/installing_bare_metal/installing-bare-metal.html#minimum-resource-requirements_installing-bare-metal",
                                       "nodes"
                                         [{"memory" 12.28, "memory_req" 16, "name" "masterY", "role" "master"} {"memory" 12.28,
                                                                                                                            "memory_req" 16,
                                                                                                                            "name" "masterZ",
                                                                                                                            "role" "master"}],
                                       "type" "rule"},
                                    "key" "NODES_MINIMUM_REQUIREMENTS_NOT_MET",
                                    "links"
                                      {"docs"
                                         ["https://docs.openshift.com/container-platform/4.1/installing/installing_bare_metal/installing-bare-metal.html#minimum-resource-requirements_installing-bare-metal"]},
                                    "rule_id" "nodes_requirements_check|NODES_MINIMUM_REQUIREMENTS_NOT_MET",
                                    "tags" [],
                                    "type" "rule"}],
    "skips"
      [{"details"
                "All: ['ccx_ocp_core.specs.must_gather_ocs.OperatorsOcsMGOCS'] Any: ",
              "reason" "MISSING_REQUIREMENTS",
              "rule_fqdn" "ccx_rules_ocp.ocs.check_ocs_version.report",
              "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather_ocs.PodsMGOCS'] Any: ",
                                    "reason" "MISSING_REQUIREMENTS",
                                    "rule_fqdn" "ccx_rules_ocp.ocs.check_pods_scc.report",
                                    "type" "skip"} {"details"
                                                            "All: ['ccx_ocp_core.specs.must_gather_ocs.OperatorsOcsMGOCS'] Any: ",
                                                          "reason" "MISSING_REQUIREMENTS",
                                                          "rule_fqdn" "ccx_rules_ocp.ocs.operator_phase_check.report",
                                                          "type" "skip"} {"details"
                                                                                  "All: ['ccx_ocp_core.specs.must_gather_ocs.PersistentVolumeClaimsMGOCS'] Any: ",
                                                                                "reason" "MISSING_REQUIREMENTS",
                                                                                "rule_fqdn" "ccx_rules_ocp.ocs.pvc_phase_check.report",
                                                                                "type" "skip"} {"details"
                                                                                                        "All: ['ccx_rules_ocp.ocs.ceph_check_mon_clock_skew.get_mon_reporting_clock_skew'] Any: ",
                                                                                                      "reason" "MISSING_REQUIREMENTS",
                                                                                                      "rule_fqdn" "ccx_rules_ocp.ocs.ceph_check_mon_clock_skew.report",
                                                                                                      "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                                                                                                                            "reason" "MISSING_REQUIREMENTS",
                                                                                                                            "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1801300.report",
                                                                                                                            "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                                                                                                                                                  "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                  "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1802248.report",
                                                                                                                                                  "type" "skip"} {"details"
                                                                                                                                                                          "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                        "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                        "rule_fqdn"
                                                                                                                                                                          "ccx_rules_ocp.external.rules.image_registry_pv_no_access.report",
                                                                                                                                                                        "type" "skip"} {"details"
                                                                                                                                                                                                "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                              "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                              "rule_fqdn"
                                                                                                                                                                                                "ccx_rules_ocp.external.rules.image_registry_pv_low_capacity.report",
                                                                                                                                                                                              "type" "skip"} {"details"
                                                                                                                                                                                                                      "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.isImageRegistryPodEmptyDirVolume', 'ccx_rules_ocp.common.conditions.image_registry.isImageRegistryPodPersistentVolume'] Any: ",
                                                                                                                                                                                                                    "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                    "rule_fqdn"
                                                                                                                                                                                                                      "ccx_rules_ocp.external.rules.image_registry_no_volume_set_check.report",
                                                                                                                                                                                                                    "type" "skip"} {"details"
                                                                                                                                                                                                                                            "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                                                                          "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                          "rule_fqdn"
                                                                                                                                                                                                                                            "ccx_rules_ocp.external.rules.image_registry_pv_not_bound.report",
                                                                                                                                                                                                                                          "type" "skip"}],
    "system" {"hostname" nil, "metadata" {}}}}

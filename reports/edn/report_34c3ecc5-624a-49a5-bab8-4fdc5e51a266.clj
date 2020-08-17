{"report"
   {"data"
      [{"created_at" "2020-03-06T12:00:00Z",
              "description"
                "Clusteroperator is degraded when the installer pods are removed too soon during upgrade",
              "details"
                "Clusteroperator is degraded with \"NodeInstallerDegraded\" in status.\n\n[Knowledgebase Article](https://access.redhat.com/solutions/4849711)\n",
              "disabled" false,
              "extra_data"
                {"degraded_operators"
                   [{"available"
                                   {"last_trans_time" "2020-04-21T12:45:10Z",
                                    "message"
                                      "Available: 2 nodes are active; 1 nodes are at revision 0; 2 nodes are at revision 2; 0 nodes have achieved new revision 3",
                                    "reason" "AsExpected",
                                    "status" true},
                                 "degraded"
                                   {"last_trans_time" "2020-04-21T12:46:14Z",
                                    "message"
                                      "NodeControllerDegraded: All master nodes are ready\nStaticPodsDegraded: nodes/ip-10-0-137-172.us-east-2.compute.internal pods/kube-apiserver-ip-10-0-137-172.us-east-2.compute.internal container=\"kube-apiserver-3\" is not ready",
                                    "reason" "NodeInstallerDegradedInstallerPodFailed",
                                    "status" true},
                                 "name" "kube-apiserver",
                                 "progressing"
                                   {"last_trans_time" "2020-04-21T12:43:00Z",
                                    "message"
                                      "Progressing: 1 nodes are at revision 0; 2 nodes are at revision 2; 0 nodes have achieved new revision 3",
                                    "reason" nil,
                                    "status" true},
                                 "upgradeable" {"last_trans_time" "2020-04-21T12:42:52Z",
                                                "message" nil,
                                                "reason" "AsExpected",
                                                "status" true},
                                 "version" "4.3.13"}],
                 "error_key" "NODE_INSTALLER_DEGRADED",
                 "type" "rule"},
              "reason"
                "Clusteroperator{{?pydata.degraded_operators.length>1}}s{{?}} degraded with NodeInstallerDegraded in reason:\n\n{{~ pydata.degraded_operators :operator }}\n**Cluster-operator:**  **{{=operator[\"name\"]}}**\n- *Reason:* {{=operator[\"degraded\"][\"reason\"]}}\n- *Message:* {{=operator[\"degraded\"][\"message\"]}}\n- *Last transition*: {{=operator[\"degraded\"][\"last_trans_time\"]}}\n\n{{~}}\n",
              "resolution"
                "You may be hitting a [known bug](https://bugzilla.redhat.com/show_bug.cgi?id=1723966) and Red Hat recommends that you complete the following steps:\n\n{{~ pydata.degraded_operators :operator }}\n{{? operator[\"name\"] == \"kube-apiserver\"}}\n- For the **kube-apiserver** clusteroperator do:\n~~~\noc patch kubeapiserver/cluster --type merge -p \"{\\\"spec\\\":{\\\"forceRedeploymentReason\\\":\\\"Forcing new revision with random number $RANDOM to make message unique\\\"}}\"\n~~~\n{{?}}\n{{? operator[\"name\"] == \"kube-controller-manager\"}}\n- For the **kube-controller-manager** clusteroperator do:\n~~~\noc patch kubecontrollermanager/cluster --type merge -p \"{\\\"spec\\\":{\\\"forceRedeploymentReason\\\":\\\"Forcing new revision with random number $RANDOM to make message unique\\\"}}\"\n~~~\n{{?}}\n{{? operator[\"name\"] == \"kube-scheduler\"}}\n- For the **kube-scheduler** clusteroperator do:\n~~~\noc patch kubescheduler/cluster --type merge -p \"{\\\"spec\\\":{\\\"forceRedeploymentReason\\\":\\\"Forcing new revision with random number $RANDOM to make message unique\\\"}}\"\n~~~\n{{?}}\nThen wait several minutes and check if the operator is no longer degraded or progressing. If it is still degraded and the same error message is shown, retry (the race condition can be triggered again). If the error message is different or some retries do not make any improvement, open a support case to get further assistance.\n\nIf this solution solves your issue, but you are interested in tracking the definitive resolution of the bug, you can open a support case to do that as well.\n{{~}}",
              "risk_of_change" 0,
              "rule_id" "ccx_rules_ocp.external.rules.node_installer_degraded",
              "tags" ["openshift" "service_availability"],
              "total_risk" 3,
              "user_vote" 0} {"created_at" "2020-04-08T00:42:00Z",
                                    "description"
                                      "Introducing Insights for Red Hat OpenShift Container Platform",
                                    "details"
                                      "Red Hat Insights for OpenShift is a proactive management solution. It provides ongoing infrastructure analyses of your Red Hat OpenShift Container Platform 4.2 and later installations. Red Hat Insights helps you identify, prioritize, and resolve risks to security, performance, availability, and stability before they become urgent issues.\nRed Hat Insights for OpenShift uses the Remote Health Monitoring feature of OpenShift 4. The health checks are created by Red Hat subject matter experts and assessed according to severity and impact.\nThis is an example  recommendation that you can safely ignore. To disable it, click  the triple-dot menu button next to the header, and select Disable.\n\n[Knowledgebase Article](https://access.redhat.com/search/#/knowledgebase)\n\n",
                                    "disabled" false,
                                    "extra_data" {"error_key" "TUTORIAL_ERROR", "type" "rule"},
                                    "reason" "",
                                    "resolution" "",
                                    "risk_of_change" 0,
                                    "rule_id" "ccx_rules_ocm.tutorial_rule",
                                    "tags" [],
                                    "total_risk" 1,
                                    "user_vote" 0} {"created_at" "2020-02-03T08:25:00Z",
                                                          "description"
                                                            "The authentication operator is degraded when cluster is configured to use a cluster-wide proxy",
                                                          "details"
                                                            "When the cluster is configured to use a cluster-wide proxy, the `authentication` operator is `Degraded`.\n\n[Knowledgebase Article](https://access.redhat.com/solutions/4569191)\n",
                                                          "disabled" false,
                                                          "extra_data"
                                                            {"error_key" "AUTH_OPERATOR_PROXY_ERROR",
                                                             "kcs" "https://access.redhat.com/solutions/4569191",
                                                             "op" {"available" {"last_trans_time" "2020-04-21T12:46:28Z",
                                                                                "message" nil,
                                                                                "reason" "NoData",
                                                                                "status" nil},
                                                                   "degraded"
                                                                     {"last_trans_time" "2020-04-21T12:46:29Z",
                                                                      "message"
                                                                        "WellKnownEndpointDegraded: failed to GET well-known",
                                                                      "reason" "AsExpected",
                                                                      "status" true},
                                                                   "name" "authentication",
                                                                   "progressing" {"last_trans_time" "2020-04-21T12:46:28Z",
                                                                                  "message" nil,
                                                                                  "reason" "NoData",
                                                                                  "status" nil},
                                                                   "upgradeable" {"last_trans_time" "2020-04-21T12:46:28Z",
                                                                                  "message" nil,
                                                                                  "reason" "AsExpected",
                                                                                  "status" true},
                                                                   "version" nil},
                                                             "type" "rule"},
                                                          "reason"
                                                            "Requests to routes and/or the public API endpoint are not being proxied to the cluster.\n",
                                                          "resolution"
                                                            "Red Hat recommends that you to follow steps in the KCS article.\n * [Authentication operator Degraded with Reason `WellKnownEndpointDegradedError`](https://access.redhat.com/solutions/4569191)\n",
                                                          "risk_of_change" 0,
                                                          "rule_id" "ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check",
                                                          "tags" ["security" "service_availability"],
                                                          "total_risk" 2,
                                                          "user_vote" 0} {"created_at" "2020-01-17T11:10:00Z",
                                                                                "description"
                                                                                  "The OpenShift cluster will experience upgrade failure when the cluster wide proxy is configured due to a bug",
                                                                                "details"
                                                                                  "Due to a known bug in OpenShift 4 the `clusterversion` operator is not respecting the cluster-wide proxy settings.\n\n[Knowledgebase Article](https://access.redhat.com/solutions/4631541)\n",
                                                                                "disabled" false,
                                                                                "extra_data" {"error_key" "BUGZILLA_BUG_1766907", "type" "rule"},
                                                                                "reason"
                                                                                  "On this OCP 4 cluster, a cluster wide proxy is set. Due to a bug, the CVO is not using the proxy. This will lead to a upgrade failure.",
                                                                                "resolution"
                                                                                  "Red Hat recommends that you to use this workaround:\n1. Set the proxy manually\n~~~\n# oc -n openshift-cluster-version set env deploy cluster-version-operator HTTP_PROXY=xxx HTTPS_PROXY=xxx NO_PROXY=xxx\n~~~\n",
                                                                                "risk_of_change" 0,
                                                                                "rule_id" "ccx_rules_ocp.external.bug_rules.bug_1766907",
                                                                                "tags" ["openshift" "networking" "service_availability"],
                                                                                "total_risk" 2,
                                                                                "user_vote" 0} {"created_at" "2019-10-29T15:00:00Z",
                                                                                                      "description"
                                                                                                        "OCP node could behave unexpectedly when it doesn't meet the minimum resource requirements",
                                                                                                      "details"
                                                                                                        "Minimum resource requirements for Openshift 4 Nodes are not met, which could cause unexpected behavior.\n\n[Knowledgebase Article](https://docs.openshift.com/container-platform/4.1/installing/installing_bare_metal/installing-bare-metal.html#minimum-resource-requirements_installing-bare-metal)\n",
                                                                                                      "disabled" false,
                                                                                                      "extra_data"
                                                                                                        {"error_key" "NODES_MINIMUM_REQUIREMENTS_NOT_MET",
                                                                                                         "link"
                                                                                                           "https://docs.openshift.com/container-platform/4.1/installing/installing_bare_metal/installing-bare-metal.html#minimum-resource-requirements_installing-bare-metal",
                                                                                                         "nodes"
                                                                                                           [{"cpu" 1,
                                                                                                                         "cpu_req" 2,
                                                                                                                         "name" "ip-10-0-144-53.us-east-2.compute.internal",
                                                                                                                         "role" "worker"}],
                                                                                                         "type" "rule"},
                                                                                                      "reason"
                                                                                                        "Node{{?pydata.nodes.length>1}}s{{?}} not meeting the minimum requirements:\n{{~ pydata.nodes :node }}\n1. {{=node[\"name\"]}}\n  * Role: {{=node[\"role\"]}}{{?node.memory}}\n  * Minimum memory requirement is {{=node[\"memory_req\"]}}, but the node is configured with {{=node[\"memory\"]}}.{{?}}{{?node.cpu}}\n  * Minimum cpu requirement is {{=node[\"cpu_req\"]}}, but the node is configured with {{=node[\"cpu\"]}}.{{?}}{{~}}",
                                                                                                      "resolution"
                                                                                                        "Red Hat recommends that you configure your nodes to meet the minimum resource requirements.\n\nMake sure that:\n\n{{~ pydata.nodes :node }}\n1. Node {{=node[\"name\"]}} ({{=node[\"role\"]}}){{?node[\"memory\"]}}\n   * Has enough memory, minimum requirement is {{=node[\"memory_req\"]}}. Currently its only configured with {{=node[\"memory\"]}}GB.{{?}}{{?node.cpu}}\n   * Has enough allocatable cpu, minimum requirement is {{=node[\"cpu_req\"]}}. Currently its only configured with {{=node[\"cpu\"]}}.{{?}}{{~}}\n",
                                                                                                      "risk_of_change" 0,
                                                                                                      "rule_id" "ccx_rules_ocp.external.rules.nodes_requirements_check",
                                                                                                      "tags" ["openshift" "configuration" "performance"],
                                                                                                      "total_risk" 2,
                                                                                                      "user_vote" 0} {"created_at" "2020-02-07T14:19:00Z",
                                                                                                                            "description"
                                                                                                                              "Pods could fail to start if openshift-samples is degraded due to FailedImageImport which is caused by a hiccup while talking to the Red Hat registry",
                                                                                                                            "details"
                                                                                                                              "The `openshift-samples` cluster-operator is degraded due to `FailedImageImport` because of a hiccup while talking to the Red Hat registry.\n\n[Knowledgebase Article](https://access.redhat.com/solutions/4563171)\n",
                                                                                                                            "disabled" false,
                                                                                                                            "extra_data"
                                                                                                                              {"error_key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                                                                                                                               "info"
                                                                                                                                 {"condition" "Degraded",
                                                                                                                                  "lastTransitionTime" "2019-12-06T15:58:09Z",
                                                                                                                                  "message"
                                                                                                                                    "Samples installed at , with image import failures for these imagestreams:",
                                                                                                                                  "name" "openshift-samples",
                                                                                                                                  "reason" "FailedImageImports"},
                                                                                                                               "kcs" "https://access.redhat.com/solutions/4563171",
                                                                                                                               "type" "rule"},
                                                                                                                            "reason"
                                                                                                                              "Due to a temporary hiccup talking to the Red Hat registry the openshift-samples failed to import some of the imagestreams.\n\n\nSource of the issue:\n\n**Cluster-operator:**  **{{=pydata.info[\"name\"]}}**\n- *Condition:* {{=pydata.info[\"condition\"]}}\n- *Reason:* {{=pydata.info[\"reason\"]}}\n- *Message:* {{=pydata.info[\"message\"]}}\n- *Last* Transition: {{=pydata.info[\"lastTransitionTime\"]}}\n",
                                                                                                                            "resolution"
                                                                                                                              "Red Hat recommends that you to follow these steps:\n\n1. Fix 1, Try running:\n~~~\n# oc import-image <for the ImageStream(s) in question>\n~~~\n\n1. Fix 2, Try running:\n~~~\n# oc delete configs.samples cluster\n~~~",
                                                                                                                            "risk_of_change" 0,
                                                                                                                            "rule_id"
                                                                                                                              "ccx_rules_ocp.external.rules.samples_op_failed_image_import_check",
                                                                                                                            "tags"
                                                                                                                              ["openshift" "incident" "networking" "registry" "service_availability"],
                                                                                                                            "total_risk" 2,
                                                                                                                            "user_vote" 0} {"created_at" "2020-04-17T16:00:00Z",
                                                                                                                                                  "description" "Cluster upgrade will fail when default SCC gets changed",
                                                                                                                                                  "details"
                                                                                                                                                    "Due to a known bug in OpenShift 4 operators cannot upgrade due to \"DefaultSecurityContextConstraints_Mutated\".\n\n[Knowledgebase Article](https://access.redhat.com/solutions/4972291)\n",
                                                                                                                                                  "disabled" true,
                                                                                                                                                  "extra_data" {"desired" "4.3.11",
                                                                                                                                                                "error_key" "BUGZILLA_BUG_1821905",
                                                                                                                                                                "type" "rule"},
                                                                                                                                                  "reason"
                                                                                                                                                    "The OCP-{{=pydata.desired}} update is blocked because default security context constraints (SCC) anyuid, hostaccess, hostmount-anyuid, hostnetwork, nonroot, privileged, or restricted have been modified\n\nUpgrading 4.3.8, 4.3.9, 4.3.10, 4.3.11, or 4.3.12 fails if security context constraints (SCC) are not the default.\n\nOCP 4.3.8 introduced a new check for modified or mutated default SCCs. If any of the SCCs anyuid, hostaccess, hostmount-anyuid, hostnetwork, nonroot, privileged, or restricted have been modified, upgrades to future releases are prevented. For more details see [BZ-1808602](https://bugzilla.redhat.com/show_bug.cgi?id=1808602) and [BZ-1810596](https://bugzilla.redhat.com/show_bug.cgi?id=1810596) from [Bug Fix Advisory RHBA-2020:0858](https://access.redhat.com/errata/RHBA-2020:0858).\n\nThis check is to ensure that environments with modified default SCCs could not be upgraded to 4.4 as changes or removal of the default SCCs could lead to unexpected behavior and system instability.\n\nOCP 4.3.13 ([Bug Fix Advisory RHBA-2020:1481](https://access.redhat.com/errata/RHBA-2020:1481)) relaxes this check and will no longer block the upgrade.\n\n",
                                                                                                                                                  "resolution"
                                                                                                                                                    "OpenShift Container Platform (OCP) 4.3.13 will no longer block upgrades if the SCC is not the default.\n\nThe original issue raised affected versions 4.3.8, 4.3.9, 4.3.10, 4.3.11, and 4.3.12.\n\n- I have already upgraded to one of the affected versions:\n  - You will need to use the `--force` flag to upgrade.\n- I must upgrade to one of the affected versions before I can upgrade to 4.3.13:\n- This is not recommended. However, if you must upgrade to an affected version, be aware that you will need to use the `--force` flag to perform your next upgrade.\n\n**Using the `--force` flag**:\n\n**IMPORTANT:** Any changes you have made to the default SCCs `anyuid`, `hostaccess`, `hostmount-anyuid`, `hostnetwork`, `nonroot`, `privileged`, or `restricted` may be removed later when you upgrade to 4.4 which could cause system instability. You should address this issue by migrating any changes you made to the mentioned default SCCs to new SCCs.\n\n- Use of the `--force` flag will skip all precondition tests. You must verify that there are no other preconditions which need to be considered.\n- Upgrading using `--force` **will not** remove the changes you have made to the default SCCs. You should create a plan to migrate the changes you made to the default SCCs to new SCCs before you upgrade to 4.4.\n\nThe `--force` flag can be added to your `oc adm upgrade` command. For example:\n~~~\n# oc adm upgrade --force --to 4.3.13\n~~~\n",
                                                                                                                                                  "risk_of_change" 0,
                                                                                                                                                  "rule_id" "ccx_rules_ocp.external.bug_rules.bug_1821905",
                                                                                                                                                  "tags" ["openshift" "service_availability"],
                                                                                                                                                  "total_risk" 3,
                                                                                                                                                  "user_vote" 0}],
    "meta" {"count" 7, "last_checked_at" "2020-05-27T14:15:35Z"}},
 "status" "ok"}
